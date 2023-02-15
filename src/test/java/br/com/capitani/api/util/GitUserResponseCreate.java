package br.com.capitani.api.util;

import br.com.capitani.api.domain.git.resultado.GitUserResponse;

import java.time.LocalDateTime;
import java.util.Date;

public class GitUserResponseCreate {
    public static final String LOGIN = "hevener10";
    public static final Long ID = 26651661L;
    public static final String NODE_ID = "MDQ6VXNlcjI2NjUxNjYx";
    public static final String AVATAR_URL = "https://avatars.githubusercontent.com/u/26651661?v=4";
    public static final String GRAVATAR_ID = "";
    public static final String URL = "https://api.github.com/users/hevener10";
    public static final String HTML_URL = "https://github.com/hevener10";
    public static final String FOLLOWERS_URL = "https://api.github.com/users/hevener10/followers";
    public static final String FOLLOWING_URL = "https://api.github.com/users/hevener10/following{/other_user}";
    public static final String GISTS_URL = "https://api.github.com/users/hevener10/gists{/gist_id}";
    public static final String STARRED_URL = "https://api.github.com/users/hevener10/starred{/owner}{/repo}";
    public static final String SUBSCRIPTIONS_URL = "https://api.github.com/users/hevener10/subscriptions";
    public static final String ORGANIZATIONS_URL = "https://api.github.com/users/hevener10/orgs";
    public static final String REPOS_URL = "https://api.github.com/users/hevener10/repos";
    public static final String EVENTS_URL = "https://api.github.com/users/hevener10/events{/privacy}";
    public static final String RECEIVED_EVENTS_URL = "https://api.github.com/users/hevener10/received_events";
    public static final String TYPE = "User";
    public static final boolean SITE_ADMIN = false;
    public static final String NAME = null;
    public static final String COMPANY = null;
    public static final String BLOG = "";
    public static final String LOCATION = null;
    public static final String EMAIL = null;
    public static final Boolean HIREABLE = null;
    public static final String BIO = null;
    public static final String TWITTER_USERNAME = null;
    public static final int PUBLIC_REPOS = 15;
    public static final int PUBLIC_GISTS = 0;
    public static final int FOLLOWERS = 5;
    public static final int FOLLOWING = 13;

    public static final LocalDateTime CREATED_AT = LocalDateTime.of(2017, 3, 24, 12, 39, 3);

    public static final LocalDateTime UPDATED_AT = LocalDateTime.of(2023, 2, 15, 13, 59, 46);


    public static GitUserResponse createGitUserResponse() {
        return GitUserResponse.builder()
                .id(ID)
                .login(LOGIN)
                .node_id(NODE_ID)
                .avatar_url(AVATAR_URL)
                .gravatar_id(GRAVATAR_ID)
                .url(URL)
                .html_url(HTML_URL)
                .followers_url(FOLLOWERS_URL)
                .following_url(FOLLOWING_URL)
                .gists_url(GISTS_URL)
                .starred_url(STARRED_URL)
                .subscriptions_url(SUBSCRIPTIONS_URL)
                .organizations_url(ORGANIZATIONS_URL)
                .repos_url(REPOS_URL)
                .events_url(EVENTS_URL)
                .received_events_url(RECEIVED_EVENTS_URL)
                .type(TYPE)
                .site_admin(SITE_ADMIN)
                .name(NAME)
                .company(COMPANY)
                .blog(BLOG)
                .location(LOCATION)
                .email(EMAIL)
                .hireable(HIREABLE)
                .bio(BIO)
                .twitter_username(TWITTER_USERNAME)
                .public_repos(PUBLIC_REPOS)
                .public_gists(PUBLIC_GISTS)
                .followers(FOLLOWERS)
                .following(FOLLOWING)
                .created_at(CREATED_AT)
                .updated_at(UPDATED_AT)
                .build();
    }
}
