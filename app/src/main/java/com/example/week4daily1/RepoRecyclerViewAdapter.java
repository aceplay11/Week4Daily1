package com.example.week4daily1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.week4daily1.model.datasource.github.GitHubRepoResponse;


import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;

public class RepoRecyclerViewAdapter extends RecyclerView.Adapter<RepoRecyclerViewAdapter.ViewHolder> {
    List<GitHubRepoResponse> responseList;

    public RepoRecyclerViewAdapter(List<GitHubRepoResponse> gitHubRepoResponseList) {

        this.responseList = gitHubRepoResponseList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final GitHubRepoResponse response = responseList.get(position);
        holder.tvNameRV.setText("Repo Name: " + response.getName());
        holder.tvLanguageRV.setText("Repo Language: " + response.getLanguage());
        holder.tvCreatedRV.setText("Repo Date Created At: " + response.getCreatedAt());

    }

    @Override
    public int getItemCount() {
        return responseList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvNameRV;
        TextView tvLanguageRV;
        TextView tvCreatedRV;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNameRV = itemView.findViewById(R.id.tvNameRV);
            tvLanguageRV = itemView.findViewById(R.id.tvLanguageRV);
            tvCreatedRV = itemView.findViewById(R.id.tvDateCreatedRV);
        }
    }

}
