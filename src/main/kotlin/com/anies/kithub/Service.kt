package com.anies.kithub

abstract class Service(val github: Github)

class ActivityService(github: Github) : Service(github)
class AuthorizationService(github: Github) : Service(github)
class BlogService(github: Github) : Service(github)
class ExploreService(github: Github) : Service(github)
class GistService(github: Github) : Service(github)
class GitService(github: Github) : Service(github)
class IssueService(github: Github) : Service(github)
class MiscService(github: Github) : Service(github)
class OrganizationService(github: Github) : Service(github)
class PullRequestService(github: Github) : Service(github)
class RepositoryService(github: Github) : Service(github)
class SearchService(github: Github) : Service(github)
class UrlShortenerService(github: Github) : Service(github)
class UserService(github: Github) : Service(github)