# Week4Daily1

Coding
1. Create an application with two screen 
 -Screen one: should have your Github profile. Use at least 4 fields from the response to update the views.
 -Screen 2: Populate the recyclerView with the repositories you get from your profile. Use at least 3 fields in each item view.


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


package com.example.week4daily1.model.datasource.remote;


import android.util.Log;

import com.example.week4daily1.model.datasource.github.GitHubResponse;
import com.google.gson.Gson;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpGitHub {


    public void getAsyncResponse() {

        OkHttpClient returnClient = new OkHttpClient.Builder().build();
        Request request = new Request.Builder().url("https://api.github.com/users/aceplay11").build();
        returnClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("TAG", "onFailure: ", e);

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                String info = response.body().string();
                Gson gson = new Gson();
                Log.d("TAG", info);
                EventBus.getDefault().post(gson.fromJson(info, GitHubResponse.class));

            }
        });
    }
}



package com.example.week4daily1.model.datasource.github;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GitHubResponse implements Parcelable
{

    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("node_id")
    @Expose
    private String nodeId;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("gravatar_id")
    @Expose
    private String gravatarId;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("followers_url")
    @Expose
    private String followersUrl;
    @SerializedName("following_url")
    @Expose
    private String followingUrl;
    @SerializedName("gists_url")
    @Expose
    private String gistsUrl;
    @SerializedName("starred_url")
    @Expose
    private String starredUrl;
    @SerializedName("subscriptions_url")
    @Expose
    private String subscriptionsUrl;
    @SerializedName("organizations_url")
    @Expose
    private String organizationsUrl;
    @SerializedName("repos_url")
    @Expose
    private String reposUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("received_events_url")
    @Expose
    private String receivedEventsUrl;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("site_admin")
    @Expose
    private Boolean siteAdmin;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("company")
    @Expose
    private Object company;
    @SerializedName("blog")
    @Expose
    private String blog;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("email")
    @Expose
    private Object email;
    @SerializedName("hireable")
    @Expose
    private Object hireable;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("public_repos")
    @Expose
    private Integer publicRepos;
    @SerializedName("public_gists")
    @Expose
    private Integer publicGists;
    @SerializedName("followers")
    @Expose
    private Integer followers;
    @SerializedName("following")
    @Expose
    private Integer following;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    public final static Parcelable.Creator<GitHubResponse> CREATOR = new Creator<GitHubResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public GitHubResponse createFromParcel(Parcel in) {
            return new GitHubResponse(in);
        }

        public GitHubResponse[] newArray(int size) {
            return (new GitHubResponse[size]);
        }

    }
    ;

    protected GitHubResponse(Parcel in) {
        this.login = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.nodeId = ((String) in.readValue((String.class.getClassLoader())));
        this.avatarUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.gravatarId = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.htmlUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.followersUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.followingUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.gistsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.starredUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.subscriptionsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.organizationsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.reposUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.eventsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.receivedEventsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.siteAdmin = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.company = ((Object) in.readValue((Object.class.getClassLoader())));
        this.blog = ((String) in.readValue((String.class.getClassLoader())));
        this.location = ((String) in.readValue((String.class.getClassLoader())));
        this.email = ((Object) in.readValue((Object.class.getClassLoader())));
        this.hireable = ((Object) in.readValue((Object.class.getClassLoader())));
        this.bio = ((String) in.readValue((String.class.getClassLoader())));
        this.publicRepos = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.publicGists = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.followers = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.following = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.createdAt = ((String) in.readValue((String.class.getClassLoader())));
        this.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public GitHubResponse() {
    }

    /**
     * 
     * @param eventsUrl
     * @param location
     * @param publicRepos
     * @param type
     * @param blog
     * @param gravatarId
     * @param subscriptionsUrl
     * @param id
     * @param following
     * @param followers
     * @param htmlUrl
     * @param nodeId
     * @param createdAt
     * @param avatarUrl
     * @param name
     * @param followingUrl
     * @param login
     * @param starredUrl
     * @param siteAdmin
     * @param gistsUrl
     * @param url
     * @param updatedAt
     * @param followersUrl
     * @param reposUrl
     * @param hireable
     * @param bio
     * @param publicGists
     * @param email
     * @param receivedEventsUrl
     * @param company
     * @param organizationsUrl
     */
    public GitHubResponse(String login, Integer id, String nodeId, String avatarUrl, String gravatarId, String url, String htmlUrl, String followersUrl, String followingUrl, String gistsUrl, String starredUrl, String subscriptionsUrl, String organizationsUrl, String reposUrl, String eventsUrl, String receivedEventsUrl, String type, Boolean siteAdmin, String name, Object company, String blog, String location, Object email, Object hireable, String bio, Integer publicRepos, Integer publicGists, Integer followers, Integer following, String createdAt, String updatedAt) {
        super();
        this.login = login;
        this.id = id;
        this.nodeId = nodeId;
        this.avatarUrl = avatarUrl;
        this.gravatarId = gravatarId;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.followersUrl = followersUrl;
        this.followingUrl = followingUrl;
        this.gistsUrl = gistsUrl;
        this.starredUrl = starredUrl;
        this.subscriptionsUrl = subscriptionsUrl;
        this.organizationsUrl = organizationsUrl;
        this.reposUrl = reposUrl;
        this.eventsUrl = eventsUrl;
        this.receivedEventsUrl = receivedEventsUrl;
        this.type = type;
        this.siteAdmin = siteAdmin;
        this.name = name;
        this.company = company;
        this.blog = blog;
        this.location = location;
        this.email = email;
        this.hireable = hireable;
        this.bio = bio;
        this.publicRepos = publicRepos;
        this.publicGists = publicGists;
        this.followers = followers;
        this.following = following;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public String getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public String getGistsUrl() {
        return gistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public String getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getCompany() {
        return company;
    }

    public void setCompany(Object company) {
        this.company = company;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getHireable() {
        return hireable;
    }

    public void setHireable(Object hireable) {
        this.hireable = hireable;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Integer getPublicRepos() {
        return publicRepos;
    }

    public void setPublicRepos(Integer publicRepos) {
        this.publicRepos = publicRepos;
    }

    public Integer getPublicGists() {
        return publicGists;
    }

    public void setPublicGists(Integer publicGists) {
        this.publicGists = publicGists;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getFollowing() {
        return following;
    }

    public void setFollowing(Integer following) {
        this.following = following;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(login);
        dest.writeValue(id);
        dest.writeValue(nodeId);
        dest.writeValue(avatarUrl);
        dest.writeValue(gravatarId);
        dest.writeValue(url);
        dest.writeValue(htmlUrl);
        dest.writeValue(followersUrl);
        dest.writeValue(followingUrl);
        dest.writeValue(gistsUrl);
        dest.writeValue(starredUrl);
        dest.writeValue(subscriptionsUrl);
        dest.writeValue(organizationsUrl);
        dest.writeValue(reposUrl);
        dest.writeValue(eventsUrl);
        dest.writeValue(receivedEventsUrl);
        dest.writeValue(type);
        dest.writeValue(siteAdmin);
        dest.writeValue(name);
        dest.writeValue(company);
        dest.writeValue(blog);
        dest.writeValue(location);
        dest.writeValue(email);
        dest.writeValue(hireable);
        dest.writeValue(bio);
        dest.writeValue(publicRepos);
        dest.writeValue(publicGists);
        dest.writeValue(followers);
        dest.writeValue(following);
        dest.writeValue(createdAt);
        dest.writeValue(updatedAt);
    }

    public int describeContents() {
        return  0;
    }

}




![Screen Shot 2019-06-25 at 12 58 27 PM](https://user-images.githubusercontent.com/51377336/60118153-abaa9200-9749-11e9-9c83-6f24aa4b6053.png)
