package com.example.week4daily1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.week4daily1.model.datasource.github.GitHubResponse;
import com.example.week4daily1.model.datasource.remote.OkHttpGitHub;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;


public class MainActivity extends AppCompatActivity {
    TextView tvUserName;
    TextView tvLogin;
    TextView tvLocation;
    TextView tvBio;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvUserName = findViewById(R.id.tvName);
        tvLogin = findViewById(R.id.tvLogin);
        tvLocation = findViewById(R.id.tvLocation);
        tvBio = findViewById(R.id.tvBio);
        OkHttpGitHub okHttpGitHub = new OkHttpGitHub();
        okHttpGitHub.getAsyncResponse();
//        RepoGitHubResponse okHpGitHub = new RepoGitHubResponse();
//        okHpGitHub.getAsyncResponse();
    }

    public void onClick(View view) {
        //tvUserName.setText(gitH);
    }



    @Override
    protected void onStart() {
        super.onStart();
        //Register to EventBus
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Unregister to EventBus
        EventBus.getDefault().unregister(this);
    }

    //Subscribe to the posting event on EventBus that is passing a gitHubResponse
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void getHubResponseEvent(GitHubResponse gitHubResponse) {
        Log.d("TAG_EVENT_RECEIVED", gitHubResponse.getName());
        tvUserName.setText(gitHubResponse.getName());
        tvLogin.setText(gitHubResponse.getLogin());
        tvLocation.setText(gitHubResponse.getLocation());
        tvBio.setText(gitHubResponse.getBio());
    }

}
