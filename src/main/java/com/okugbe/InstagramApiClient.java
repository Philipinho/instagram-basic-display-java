package com.okugbe;


import com.okugbe.domain.InstagramGraph.AccessToken;
import com.okugbe.domain.InstagramGraph.BasicProfile;
import com.okugbe.domain.InstagramGraph.InstaMedia;

public interface InstagramApiClient {

    InstaMedia getMedia(String accessToken);

    BasicProfile getProfile(String accessToken);

    AccessToken refreshAccessToken(String oldAccessToken);
}
