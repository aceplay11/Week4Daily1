package com.example.week4daily1.model.datasource.remote;

import android.util.Log;

import com.example.week4daily1.model.datasource.github.GitHubRepoResponse;
import com.example.week4daily1.model.datasource.github.GitHubResponse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpRepoGitHub {
    public void getAsyncResponse() {
        OkHttpClient returnClient = new OkHttpClient.Builder().build();
        Request request = new Request.Builder().url("https://api.github.com/users/aceplay11/repos").build();
        returnClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Type list = new TypeToken<List<GitHubRepoResponse>>(){}.getType();

                String info = response.body().string();
                Gson gson = new Gson();
                Log.d("TAG", info);
                List<GitHubRepoResponse> gitHubRepoResponses = gson.fromJson(info, list);
                EventBus.getDefault().post(gitHubRepoResponses);


            }
        });
    }
}
