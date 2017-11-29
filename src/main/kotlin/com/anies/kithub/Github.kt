package com.anies.kithub

class Github(val endpoint: String = "https://api.github.com", val auth: Authentication = Authentication.Anonymous) {
    var ratelimitReset: Int = 0
    var ratelimitLimit: Int = 0
    var ratelimitRemaining: Int = 0

    val activity = ActivityService(this)
    val authorizations = AuthorizationService(this)
    val blog = BlogService(this)
    val explore = ExploreService(this)
    val gists = GistService(this)
    val git = GitService(this)
    val issues = IssueService(this)
    val misc = MiscService(this)
    val organizations = OrganizationService(this)
    val pullRequests = PullRequestService(this)
    val repositories = RepositoryService(this)
    val search = SearchService(this)
    val urlShortener = UrlShortenerService(this)
    val users = UserService(this)
}
