package app.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.githubdemo.app.R;

import java.util.ArrayList;
import java.util.List;

import app.model.News;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
    List<News.Item> mItems;
    Context mContext;

    public CardAdapter(Context context) {
        super();

        mContext = context;
        mItems = new ArrayList<News.Item>();
    }

    public void addData(List<News.Item> items) {
        mItems = items;
        notifyDataSetChanged();
    }

    public void clear() {
        mItems.clear();
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        News.Item item = mItems.get(i);

        viewHolder.tvTitle.setText(item.getTitle());
        viewHolder.tvDescription.setText(item.getDescription());
        //viewHolder.blog.setText("blog: " + github.getBlog());
        // load the background image
        if (item.getThumbnail() != null) {
            Glide.with(mContext)
                    .load(item.getThumbnail())
                    .asBitmap()
                    .fitCenter()
                    .into(viewHolder.ivIcon);
        }
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivIcon;
        public TextView tvTitle;
        public TextView tvDescription;
        //public TextView blog;

        public ViewHolder(View itemView) {
            super(itemView);

            ivIcon = (ImageView) itemView.findViewById(R.id.iv_icon);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            tvDescription = (TextView) itemView.findViewById(R.id.tv_description);
            //blog = (TextView) itemView.findViewById(blog);
        }
    }
}