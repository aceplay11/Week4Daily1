package com.example.week4daily1.model.datasource.remote;

import android.os.AsyncTask;
import android.util.Log;

import com.example.week4daily1.model.datasource.github.GitHubResponse;
import com.google.gson.Gson;

public class GitHubAsyncTask extends AsyncTask< Void, String, GitHubResponse> {
    @Override
    protected GitHubResponse doInBackground(Void... voids) {
        HttpUrlConnection httpUrlConnection = new HttpUrlConnection();

        String responseFromGitHub = httpUrlConnection.getJsonFromGitHub();
        Gson gson = new Gson();
        GitHubResponse response = gson.fromJson(responseFromGitHub, GitHubResponse.class);
        Log.d("TAG", responseFromGitHub);

        return response;
    }
     @Override
    protected void onPostExecute(GitHubResponse gitHubResponse){
        super.onPostExecute(gitHubResponse);
         Log.d("TAG", gitHubResponse.getBio());
     }
}
