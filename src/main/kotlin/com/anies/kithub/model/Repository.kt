package com.anies.kithub.model

typealias Url = String
typealias Date = String
typealias State = String

interface Repository {
    val id: Long
    @JsName("full_name")
    val fullName: String
    val owner: Owner
    val private: Boolean
    @JsName("html_url")
    val htmlUrl: Url
    val description: String
    val fork: Boolean
    val url: Url
    @JsName("forks_url")
    val forksUrl: String
    @JsName("keys_url")
    val keysUrl: Url
    @JsName("collaborators_url")
    val collaboratorsUrl: Url
    @JsName("teams_url")
    val teamsUrl: Url
    @JsName("hooks_url")
    val hooksUrl: Url
    @JsName("issue_events_url")
    val issueEventsUrl: Url
    @JsName("events_url")
    val eventsUrl: Url
    @JsName("assignees_url")
    val assigneesUrl: Url
    @JsName("branches_url")
    val branchesUrl: Url
    @JsName("tags_url")
    val tagsUrl: Url
    @JsName("blobs_url")
    val blobsUrl: Url
    @JsName("git_tags_url")
    val gitTagsUrl: Url
    @JsName("git_refs_url")
    val gitRefsUrl: Url
    @JsName("trees_url")
    val treesUrl: Url
    @JsName("statuses_url")
    val statusesUrl: Url
    @JsName("languages_url")
    val languagesUrl: Url
    @JsName("stargazers_url")
    val stargazersUrl: Url
    @JsName("contributors_url")
    val contributorsUrl: Url
    @JsName("subscribers_url")
    val subscribersUrl: Url
    @JsName("subscription_url")
    val subscriptionUrl: Url
    @JsName("commits_url")
    val commitsUrl: Url
    @JsName("git_commits_url")
    val gitCommitsUrl: Url
    @JsName("comments_url")
    val commentsUrl: Url
    @JsName("issue_comment_url")
    val issueCommentUrl: Url
    @JsName("contents_url")
    val contentsUrl: Url
    @JsName("compare_url")
    val compareUrl: Url
    @JsName("merges_url")
    val mergesUrl: Url
    @JsName("archive_url")
    val archiveUrl: Url
    @JsName("downloads_url")
    val downloadsUrl: Url
    @JsName("issues_url")
    val issuesUrl: Url
    @JsName("pulls_url")
    val pullsUrl: Url
    @JsName("milestones_url")
    val milestonesUrl: Url
    @JsName("notifications_url")
    val notificationsUrl: Url
    @JsName("labels_url")
    val labelsUrl: Url
    @JsName("releases_url")
    val releasesUrl: Url
    @JsName("deployments_url")
    val deploymentsUrl: Url
    @JsName("created_at")
    val createdAt: Date
    @JsName("updated_at")
    val updatedAt: Date
    @JsName("pushed_at")
    val pushedAt: Date
    @JsName("git_url")
    val gitUrl: Url
    @JsName("ssh_url")
    val sshUrl: Url
    @JsName("clone_url")
    val cloneUrl: Url
    @JsName("svn_url")
    val svnUrl: Url
    val homepage: Url?
    val size: Long
    @JsName("stargazers_count")
    val stargazersCount: Int
    @JsName("watchers_count")
    val watchersCount: Int
    val language: String?
    @JsName("has_issues")
    val hasIssues: Boolean
    @JsName("has_projects")
    val hasProjects: Boolean
    @JsName("has_downloads")
    val hasDownloads: Boolean
    @JsName("has_wiki")
    val hasWiki: Boolean
    @JsName("has_pages")
    val hasPages: Boolean
    @JsName("forks_count")
    val forksCount: Int
    @JsName("mirror_url")
    val mirrorUrl: Url?
    val archived: Boolean
    @JsName("open_issues_count")
    val openIssuesCount: Int
    val license: License?
    val forks: Int
    @JsName("open_issues")
    val openIssues: Int
    val watchers: Int
    @JsName("default_branch")
    val defaultBranch: String
    @JsName("network_count")
    val networkCount: Int
    @JsName("subscribers_count")
    val subscribersCount: Int
}

interface Owner {
    val login: String
    val id: Long
    @JsName("avatar_url")
    val avatarUrl: Url
    @JsName("gravatar_id")
    val gravatarId: String
    val url: Url
    @JsName("html_url")
    val htmlUrl: Url
    @JsName("followers_url")
    val followersUrl: Url
    @JsName("following_url")
    val followingUrl: Url
    @JsName("gists_url")
    val gistsUrl: Url
    @JsName("starred_url")
    val starredUrl: Url
    @JsName("subscriptions_url")
    val subscriptionsUrl: Url
    @JsName("organizations_url")
    val organizationsUrl: Url
    @JsName("repos_url")
    val reposUrl: Url
    @JsName("events_url")
    val eventsUrl: Url
    @JsName("received_events_url")
    val receivedEventsUrl: Url
    val type: String
    @JsName("site_admin")
    val siteAdmin: Boolean
}

interface License {
    val key: String
    val name: String
    @JsName("spdx_id")
    val spdxId: String
    val url: Url
}

interface PullRequest {
    val url: String
    val id: Long
    @JsName("html_url")
    val htmlUrl: Url
    @JsName("diff_url")
    val diffUrl: Url
    @JsName("patch_url")
    val patchUrl: Url
    @JsName("issue_url")
    val issueUrl: Url
    val number: Int
    val state: State
    val locked: Boolean
    val title: String
    val user: dynamic // TODO: Add user object? Or ignore like "Organization" in /repos/:org/:repo
    val body: String
    @JsName("created_at")
    val createdAt: Date
    @JsName("updated_at")
    val updatedAt: Date
    @JsName("closed_at")
    val closedAt: Date?
    @JsName("merged_at")
    val mergedAt: Date?
    @JsName("merge_commit_sha")
    val mergeCommitSha: String
    val assignee: dynamic // TODO: Find out what this is.
    val assignees: List<dynamic>
    @JsName("requested_reviewers")
    val requestedReviewers: List<dynamic>
    val milestone: dynamic
    @JsName("commits_url")
    val commitsUrl: Url
    @JsName("review_comments_url")
    val reviewCommentsUrl: Url
    @JsName("review_comment_url")
    val reviewCommentUrl: Url
    @JsName("comments_url")
    val commentsUrl: Url
    @JsName("statuses_url")
    val statusesUrl: Url
    val head: dynamic // TODO: Make object for this.
    val base: dynamic
    @JsName("author_association")
    val authorAssociation: String // TODO: Make enum?
}