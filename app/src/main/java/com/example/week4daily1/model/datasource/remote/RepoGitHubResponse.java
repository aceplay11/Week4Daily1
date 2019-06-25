package com.example.week4daily1.model.datasource.remote;

import android.util.Log;

import com.example.week4daily1.model.datasource.github.GitHubResponse;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RepoGitHubResponse {
    public void getAsyncResponse() {
        OkHttpClient returnClient = new OkHttpClient.Builder().build();
        Request request = new Request.Builder().url("https://api.github.com/users/aceplay11").build();
        returnClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                    Gson gson = new Gson();
//                    gitHubResponse = gson.fromJson(response.body().string(), GitHubResponse.class);
//                    Log.d("TAG", gitHubResponse.getName());


            }
        });
    }
}
