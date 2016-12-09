package app.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.githubdemo.app.R;

import app.adapter.CardAdapter;
import app.model.News;
import app.service.GithubService;
import app.service.ServiceFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Set up Android CardView/RecycleView
         */
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        final CardAdapter mCardAdapter = new CardAdapter(this);
        mRecyclerView.setAdapter(mCardAdapter);

        /**
         * START: button set up
         */
        Button bClear = (Button) findViewById(R.id.button_clear);
        Button bFetch = (Button) findViewById(R.id.button_fetch);
        bClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mCardAdapter.clear();
            }
        });

        bFetch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                GithubService service = ServiceFactory.createRetrofitService(GithubService.class, GithubService.SERVICE_RSS2_JSON);

//                for(String login : Data.githubList) {
//                    service.getUser(login)
//                        .subscribeOn(Schedulers.newThread())
//                        .observeOn(AndroidSchedulers.mainThread())
//                        .subscribe(new Subscriber<Github>() {
//                            @Override
//                            public final void onCompleted() {
//                                // do nothing
//                            }
//
//                            @Override
//                            public final void onError(Throwable e) {
//                                Log.e("GithubDemo", e.getMessage());
//                            }
//
//                            @Override
//                            public final void onNext(Github response) {
//                                mCardAdapter.addData(response);
//                            }
//                        });
//                }


                service.getNews()
                        .subscribeOn(Schedulers.newThread())
                        .observeOn(Schedulers.computation())
                        .map(new Func1<News, News>() {
                            @Override
                            public News call(News news) {
                                return null;
                            }
                        })
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Subscriber<News>() {
                            @Override
                            public void onCompleted() {
                                Log.e("GithubDemo", "onCompleted");
                            }

                            @Override
                            public void onError(Throwable e) {
                                Log.e("GithubDemo", "" + e);
                            }

                            @Override
                            public void onNext(News news) {
                                Log.e("GithubDemo", "" + news);
                                if (news != null) {
                                    mCardAdapter.addData(news.getItems());
                                }
                            }
                        });

            }
        });
        /**
         * END: button set up
         */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
