package com.okugbe.impl;

import com.okugbe.InstagramApi;
import com.okugbe.InstagramApiClient;
import com.okugbe.InstagramApiService;
import com.okugbe.domain.InstagramGraph.AccessToken;
import com.okugbe.domain.InstagramGraph.BasicProfile;
import com.okugbe.domain.InstagramGraph.InstaMedia;

public class InstagramApiClientImpl implements InstagramApiClient {
    private final InstagramApiService instagramApiService;
    private final InstagramApi instagramApi;

    public InstagramApiClientImpl(){
        this.instagramApi = new InstagramApi();
        this.instagramApiService = instagramApi.createService(InstagramApiService.class);
    }


    @Override
    public InstaMedia getMedia(String accessToken) {
        return instagramApi.executeSync(instagramApiService.getMedia(accessToken));
    }

    @Override
    public BasicProfile getProfile(String accessToken) {
        return instagramApi.executeSync(instagramApiService.getProfile(accessToken));
    }

    @Override
    public AccessToken refreshAccessToken(String oldAccessToken) {
        return instagramApi.executeSync(instagramApiService.refreshAccessToken(oldAccessToken));
    }
}
