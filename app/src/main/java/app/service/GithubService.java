package app.service;

import app.model.Github;
import app.model.News;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import rx.Observable;

public interface GithubService {
    String SERVICE_ENDPOINT = "https://api.github.com";
    String SERVICE_RSS2_JSON = "https://api.rss2json.com";

    @GET("/users/{login}")
    Observable<Github> getUser(@Path("login") String login);

    @POST("/v1/api.json?rss_url=http%3A%2F%2Ffeeds.bbci.co.uk%2Fnews%2Ftechnology%2Frss.xml%3Fedition%3Duk")
    Observable<News> getNews();
}
