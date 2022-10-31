package com.okugbe;


import com.okugbe.exception.InstagramApiException;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;

public class InstagramApi {
    private final String API_BASE_URL = "https://graph.instagram.com/";

    private final Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .client(createHttpClient())
            .addConverterFactory(JacksonConverterFactory.create());

    private final Retrofit retrofit = builder.build();

    public <S> S createService(Class<S> serviceClass){
        return retrofit.create(serviceClass);
    }

    public <T> T executeSync(Call<T> call) {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                try {
                    InstagramApiError apiError = getInstagramApiError(response);
                    throw new InstagramApiException(apiError);
                } catch (IOException e) {
                    throw new InstagramApiException(response.toString(), e);
                }
            }
        } catch (IOException e) {
            throw new InstagramApiException(e);
        }
    }

    private OkHttpClient createHttpClient(){
        return new OkHttpClient()
                .newBuilder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
    }

    private InstagramApiError getInstagramApiError(Response<?> response) throws IOException{
        return (InstagramApiError) retrofit.responseBodyConverter(InstagramApiError.class,new Annotation[0])
                .convert(response.errorBody());

    }
}
