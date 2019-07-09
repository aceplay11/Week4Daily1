package com.example.week4daily1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.week4daily1.model.datasource.github.GitHubRepoResponse;
import com.example.week4daily1.model.datasource.remote.OkHttpRepoGitHub;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;

public class GithubRepoActivity extends AppCompatActivity {


    RecyclerView repoRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_repo);

        OkHttpRepoGitHub okHttpRepoGitHub = new OkHttpRepoGitHub();
        okHttpRepoGitHub.getAsyncResponse();

        repoRecyclerView = findViewById(R.id.rvRepos);


    }

    public void populateRecyclerView(List<GitHubRepoResponse> repoResponses) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        RepoRecyclerViewAdapter repoRecyclerViewAdapter = new RepoRecyclerViewAdapter(repoResponses);
        repoRecyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL));
        repoRecyclerView.setLayoutManager(layoutManager);
        repoRecyclerView.setAdapter(repoRecyclerViewAdapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void getHubResponseEvent(List<GitHubRepoResponse> gitHubRepoResponse) {
        populateRecyclerView(gitHubRepoResponse);
    }
}
