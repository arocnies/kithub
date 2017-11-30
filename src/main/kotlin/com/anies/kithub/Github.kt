package com.anies.kithub

import kotlin.js.Date

class Github(val endpoint: String = "https://api.github.com", val auth: Authentication = Authentication.Anonymous) {
    val rateLimit = RateLimit(0, 0, 0.0)

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

class RateLimit(val limit: Int, var remaining: Int = limit, var resetTime: Double)

fun Int.minutesToMilliseconds() = this * 60_000
