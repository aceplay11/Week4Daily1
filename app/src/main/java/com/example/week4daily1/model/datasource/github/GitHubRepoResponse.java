
package com.example.week4daily1.model.datasource.github;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GitHubRepoResponse implements Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("node_id")
    @Expose
    private String nodeId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("private")
    @Expose
    private Boolean _private;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("fork")
    @Expose
    private Boolean fork;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("forks_url")
    @Expose
    private String forksUrl;
    @SerializedName("keys_url")
    @Expose
    private String keysUrl;
    @SerializedName("collaborators_url")
    @Expose
    private String collaboratorsUrl;
    @SerializedName("teams_url")
    @Expose
    private String teamsUrl;
    @SerializedName("hooks_url")
    @Expose
    private String hooksUrl;
    @SerializedName("issue_events_url")
    @Expose
    private String issueEventsUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("assignees_url")
    @Expose
    private String assigneesUrl;
    @SerializedName("branches_url")
    @Expose
    private String branchesUrl;
    @SerializedName("tags_url")
    @Expose
    private String tagsUrl;
    @SerializedName("blobs_url")
    @Expose
    private String blobsUrl;
    @SerializedName("git_tags_url")
    @Expose
    private String gitTagsUrl;
    @SerializedName("git_refs_url")
    @Expose
    private String gitRefsUrl;
    @SerializedName("trees_url")
    @Expose
    private String treesUrl;
    @SerializedName("statuses_url")
    @Expose
    private String statusesUrl;
    @SerializedName("languages_url")
    @Expose
    private String languagesUrl;
    @SerializedName("stargazers_url")
    @Expose
    private String stargazersUrl;
    @SerializedName("contributors_url")
    @Expose
    private String contributorsUrl;
    @SerializedName("subscribers_url")
    @Expose
    private String subscribersUrl;
    @SerializedName("subscription_url")
    @Expose
    private String subscriptionUrl;
    @SerializedName("commits_url")
    @Expose
    private String commitsUrl;
    @SerializedName("git_commits_url")
    @Expose
    private String gitCommitsUrl;
    @SerializedName("comments_url")
    @Expose
    private String commentsUrl;
    @SerializedName("issue_comment_url")
    @Expose
    private String issueCommentUrl;
    @SerializedName("contents_url")
    @Expose
    private String contentsUrl;
    @SerializedName("compare_url")
    @Expose
    private String compareUrl;
    @SerializedName("merges_url")
    @Expose
    private String mergesUrl;
    @SerializedName("archive_url")
    @Expose
    private String archiveUrl;
    @SerializedName("downloads_url")
    @Expose
    private String downloadsUrl;
    @SerializedName("issues_url")
    @Expose
    private String issuesUrl;
    @SerializedName("pulls_url")
    @Expose
    private String pullsUrl;
    @SerializedName("milestones_url")
    @Expose
    private String milestonesUrl;
    @SerializedName("notifications_url")
    @Expose
    private String notificationsUrl;
    @SerializedName("labels_url")
    @Expose
    private String labelsUrl;
    @SerializedName("releases_url")
    @Expose
    private String releasesUrl;
    @SerializedName("deployments_url")
    @Expose
    private String deploymentsUrl;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("pushed_at")
    @Expose
    private String pushedAt;
    @SerializedName("git_url")
    @Expose
    private String gitUrl;
    @SerializedName("ssh_url")
    @Expose
    private String sshUrl;
    @SerializedName("clone_url")
    @Expose
    private String cloneUrl;
    @SerializedName("svn_url")
    @Expose
    private String svnUrl;
    @SerializedName("homepage")
    @Expose
    private Object homepage;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("stargazers_count")
    @Expose
    private Integer stargazersCount;
    @SerializedName("watchers_count")
    @Expose
    private Integer watchersCount;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("has_issues")
    @Expose
    private Boolean hasIssues;
    @SerializedName("has_projects")
    @Expose
    private Boolean hasProjects;
    @SerializedName("has_downloads")
    @Expose
    private Boolean hasDownloads;
    @SerializedName("has_wiki")
    @Expose
    private Boolean hasWiki;
    @SerializedName("has_pages")
    @Expose
    private Boolean hasPages;
    @SerializedName("forks_count")
    @Expose
    private Integer forksCount;
    @SerializedName("mirror_url")
    @Expose
    private Object mirrorUrl;
    @SerializedName("archived")
    @Expose
    private Boolean archived;
    @SerializedName("disabled")
    @Expose
    private Boolean disabled;
    @SerializedName("open_issues_count")
    @Expose
    private Integer openIssuesCount;
    @SerializedName("license")
    @Expose
    private Object license;
    @SerializedName("forks")
    @Expose
    private Integer forks;
    @SerializedName("open_issues")
    @Expose
    private Integer openIssues;
    @SerializedName("watchers")
    @Expose
    private Integer watchers;
    @SerializedName("default_branch")
    @Expose
    private String defaultBranch;
    public final static Parcelable.Creator<GitHubRepoResponse> CREATOR = new Creator<GitHubRepoResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public GitHubRepoResponse createFromParcel(Parcel in) {
            return new GitHubRepoResponse(in);
        }

        public GitHubRepoResponse[] newArray(int size) {
            return (new GitHubRepoResponse[size]);
        }

    }
    ;

    protected GitHubRepoResponse(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.nodeId = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.fullName = ((String) in.readValue((String.class.getClassLoader())));
        this._private = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.owner = ((Owner) in.readValue((Owner.class.getClassLoader())));
        this.htmlUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((Object) in.readValue((Object.class.getClassLoader())));
        this.fork = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.forksUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.keysUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.collaboratorsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.teamsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.hooksUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.issueEventsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.eventsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.assigneesUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.branchesUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.tagsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.blobsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.gitTagsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.gitRefsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.treesUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.statusesUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.languagesUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.stargazersUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.contributorsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.subscribersUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.subscriptionUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.commitsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.gitCommitsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.commentsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.issueCommentUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.contentsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.compareUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.mergesUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.archiveUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.downloadsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.issuesUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.pullsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.milestonesUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.notificationsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.labelsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.releasesUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.deploymentsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.createdAt = ((String) in.readValue((String.class.getClassLoader())));
        this.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
        this.pushedAt = ((String) in.readValue((String.class.getClassLoader())));
        this.gitUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.sshUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.cloneUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.svnUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.homepage = ((Object) in.readValue((Object.class.getClassLoader())));
        this.size = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.stargazersCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.watchersCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.language = ((String) in.readValue((String.class.getClassLoader())));
        this.hasIssues = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.hasProjects = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.hasDownloads = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.hasWiki = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.hasPages = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.forksCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.mirrorUrl = ((Object) in.readValue((Object.class.getClassLoader())));
        this.archived = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.disabled = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.openIssuesCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.license = ((Object) in.readValue((Object.class.getClassLoader())));
        this.forks = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.openIssues = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.watchers = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.defaultBranch = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public GitHubRepoResponse() {
    }

    /**
     * 
     * @param notificationsUrl
     * @param releasesUrl
     * @param pushedAt
     * @param gitTagsUrl
     * @param contentsUrl
     * @param blobsUrl
     * @param issueEventsUrl
     * @param nodeId
     * @param htmlUrl
     * @param _private
     * @param hooksUrl
     * @param description
     * @param commentsUrl
     * @param commitsUrl
     * @param labelsUrl
     * @param assigneesUrl
     * @param mergesUrl
     * @param fork
     * @param compareUrl
     * @param stargazersUrl
     * @param gitRefsUrl
     * @param deploymentsUrl
     * @param watchersCount
     * @param openIssuesCount
     * @param mirrorUrl
     * @param homepage
     * @param url
     * @param size
     * @param keysUrl
     * @param gitCommitsUrl
     * @param milestonesUrl
     * @param downloadsUrl
     * @param issueCommentUrl
     * @param pullsUrl
     * @param owner
     * @param forksUrl
     * @param hasProjects
     * @param language
     * @param statusesUrl
     * @param eventsUrl
     * @param openIssues
     * @param teamsUrl
     * @param sshUrl
     * @param contributorsUrl
     * @param stargazersCount
     * @param tagsUrl
     * @param id
     * @param hasIssues
     * @param archived
     * @param createdAt
     * @param name
     * @param treesUrl
     * @param cloneUrl
     * @param issuesUrl
     * @param license
     * @param gitUrl
     * @param forksCount
     * @param watchers
     * @param subscriptionUrl
     * @param svnUrl
     * @param archiveUrl
     * @param hasPages
     * @param languagesUrl
     * @param updatedAt
     * @param collaboratorsUrl
     * @param forks
     * @param hasDownloads
     * @param subscribersUrl
     * @param branchesUrl
     * @param fullName
     * @param hasWiki
     * @param disabled
     * @param defaultBranch
     */
    public GitHubRepoResponse(Integer id, String nodeId, String name, String fullName, Boolean _private, Owner owner, String htmlUrl, Object description, Boolean fork, String url, String forksUrl, String keysUrl, String collaboratorsUrl, String teamsUrl, String hooksUrl, String issueEventsUrl, String eventsUrl, String assigneesUrl, String branchesUrl, String tagsUrl, String blobsUrl, String gitTagsUrl, String gitRefsUrl, String treesUrl, String statusesUrl, String languagesUrl, String stargazersUrl, String contributorsUrl, String subscribersUrl, String subscriptionUrl, String commitsUrl, String gitCommitsUrl, String commentsUrl, String issueCommentUrl, String contentsUrl, String compareUrl, String mergesUrl, String archiveUrl, String downloadsUrl, String issuesUrl, String pullsUrl, String milestonesUrl, String notificationsUrl, String labelsUrl, String releasesUrl, String deploymentsUrl, String createdAt, String updatedAt, String pushedAt, String gitUrl, String sshUrl, String cloneUrl, String svnUrl, Object homepage, Integer size, Integer stargazersCount, Integer watchersCount, String language, Boolean hasIssues, Boolean hasProjects, Boolean hasDownloads, Boolean hasWiki, Boolean hasPages, Integer forksCount, Object mirrorUrl, Boolean archived, Boolean disabled, Integer openIssuesCount, Object license, Integer forks, Integer openIssues, Integer watchers, String defaultBranch) {
        super();
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.fullName = fullName;
        this._private = _private;
        this.owner = owner;
        this.htmlUrl = htmlUrl;
        this.description = description;
        this.fork = fork;
        this.url = url;
        this.forksUrl = forksUrl;
        this.keysUrl = keysUrl;
        this.collaboratorsUrl = collaboratorsUrl;
        this.teamsUrl = teamsUrl;
        this.hooksUrl = hooksUrl;
        this.issueEventsUrl = issueEventsUrl;
        this.eventsUrl = eventsUrl;
        this.assigneesUrl = assigneesUrl;
        this.branchesUrl = branchesUrl;
        this.tagsUrl = tagsUrl;
        this.blobsUrl = blobsUrl;
        this.gitTagsUrl = gitTagsUrl;
        this.gitRefsUrl = gitRefsUrl;
        this.treesUrl = treesUrl;
        this.statusesUrl = statusesUrl;
        this.languagesUrl = languagesUrl;
        this.stargazersUrl = stargazersUrl;
        this.contributorsUrl = contributorsUrl;
        this.subscribersUrl = subscribersUrl;
        this.subscriptionUrl = subscriptionUrl;
        this.commitsUrl = commitsUrl;
        this.gitCommitsUrl = gitCommitsUrl;
        this.commentsUrl = commentsUrl;
        this.issueCommentUrl = issueCommentUrl;
        this.contentsUrl = contentsUrl;
        this.compareUrl = compareUrl;
        this.mergesUrl = mergesUrl;
        this.archiveUrl = archiveUrl;
        this.downloadsUrl = downloadsUrl;
        this.issuesUrl = issuesUrl;
        this.pullsUrl = pullsUrl;
        this.milestonesUrl = milestonesUrl;
        this.notificationsUrl = notificationsUrl;
        this.labelsUrl = labelsUrl;
        this.releasesUrl = releasesUrl;
        this.deploymentsUrl = deploymentsUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.pushedAt = pushedAt;
        this.gitUrl = gitUrl;
        this.sshUrl = sshUrl;
        this.cloneUrl = cloneUrl;
        this.svnUrl = svnUrl;
        this.homepage = homepage;
        this.size = size;
        this.stargazersCount = stargazersCount;
        this.watchersCount = watchersCount;
        this.language = language;
        this.hasIssues = hasIssues;
        this.hasProjects = hasProjects;
        this.hasDownloads = hasDownloads;
        this.hasWiki = hasWiki;
        this.hasPages = hasPages;
        this.forksCount = forksCount;
        this.mirrorUrl = mirrorUrl;
        this.archived = archived;
        this.disabled = disabled;
        this.openIssuesCount = openIssuesCount;
        this.license = license;
        this.forks = forks;
        this.openIssues = openIssues;
        this.watchers = watchers;
        this.defaultBranch = defaultBranch;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Boolean getFork() {
        return fork;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
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

    public String getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    public Object getHomepage() {
        return homepage;
    }

    public void setHomepage(Object homepage) {
        this.homepage = homepage;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public Integer getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public Boolean getHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public Boolean getHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public Boolean getHasPages() {
        return hasPages;
    }

    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    public Integer getForksCount() {
        return forksCount;
    }

    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    public Object getMirrorUrl() {
        return mirrorUrl;
    }

    public void setMirrorUrl(Object mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public Object getLicense() {
        return license;
    }

    public void setLicense(Object license) {
        this.license = license;
    }

    public Integer getForks() {
        return forks;
    }

    public void setForks(Integer forks) {
        this.forks = forks;
    }

    public Integer getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    public Integer getWatchers() {
        return watchers;
    }

    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(nodeId);
        dest.writeValue(name);
        dest.writeValue(fullName);
        dest.writeValue(_private);
        dest.writeValue(owner);
        dest.writeValue(htmlUrl);
        dest.writeValue(description);
        dest.writeValue(fork);
        dest.writeValue(url);
        dest.writeValue(forksUrl);
        dest.writeValue(keysUrl);
        dest.writeValue(collaboratorsUrl);
        dest.writeValue(teamsUrl);
        dest.writeValue(hooksUrl);
        dest.writeValue(issueEventsUrl);
        dest.writeValue(eventsUrl);
        dest.writeValue(assigneesUrl);
        dest.writeValue(branchesUrl);
        dest.writeValue(tagsUrl);
        dest.writeValue(blobsUrl);
        dest.writeValue(gitTagsUrl);
        dest.writeValue(gitRefsUrl);
        dest.writeValue(treesUrl);
        dest.writeValue(statusesUrl);
        dest.writeValue(languagesUrl);
        dest.writeValue(stargazersUrl);
        dest.writeValue(contributorsUrl);
        dest.writeValue(subscribersUrl);
        dest.writeValue(subscriptionUrl);
        dest.writeValue(commitsUrl);
        dest.writeValue(gitCommitsUrl);
        dest.writeValue(commentsUrl);
        dest.writeValue(issueCommentUrl);
        dest.writeValue(contentsUrl);
        dest.writeValue(compareUrl);
        dest.writeValue(mergesUrl);
        dest.writeValue(archiveUrl);
        dest.writeValue(downloadsUrl);
        dest.writeValue(issuesUrl);
        dest.writeValue(pullsUrl);
        dest.writeValue(milestonesUrl);
        dest.writeValue(notificationsUrl);
        dest.writeValue(labelsUrl);
        dest.writeValue(releasesUrl);
        dest.writeValue(deploymentsUrl);
        dest.writeValue(createdAt);
        dest.writeValue(updatedAt);
        dest.writeValue(pushedAt);
        dest.writeValue(gitUrl);
        dest.writeValue(sshUrl);
        dest.writeValue(cloneUrl);
        dest.writeValue(svnUrl);
        dest.writeValue(homepage);
        dest.writeValue(size);
        dest.writeValue(stargazersCount);
        dest.writeValue(watchersCount);
        dest.writeValue(language);
        dest.writeValue(hasIssues);
        dest.writeValue(hasProjects);
        dest.writeValue(hasDownloads);
        dest.writeValue(hasWiki);
        dest.writeValue(hasPages);
        dest.writeValue(forksCount);
        dest.writeValue(mirrorUrl);
        dest.writeValue(archived);
        dest.writeValue(disabled);
        dest.writeValue(openIssuesCount);
        dest.writeValue(license);
        dest.writeValue(forks);
        dest.writeValue(openIssues);
        dest.writeValue(watchers);
        dest.writeValue(defaultBranch);
    }

    public int describeContents() {
        return  0;
    }

}
