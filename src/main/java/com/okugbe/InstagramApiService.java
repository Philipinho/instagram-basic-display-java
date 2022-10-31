package com.okugbe;


import com.okugbe.domain.InstagramGraph.AccessToken;
import com.okugbe.domain.InstagramGraph.BasicProfile;
import com.okugbe.domain.InstagramGraph.InstaMedia;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface InstagramApiService {

    @GET("me/media?fields=id,username,media_type,caption,timestamp,media_url,permalink,children{id,media_type,media_url}")
    Call<InstaMedia> getMedia(@Query("access_token") String accessToken);

    @GET("me?fields=id,username")
    Call<BasicProfile> getProfile(@Query("access_token") String accessToken);

    @GET("refresh_access_token?grant_type=ig_refresh_token")
    Call<AccessToken> refreshAccessToken(@Query("access_token") String oldAccessToken);

}
