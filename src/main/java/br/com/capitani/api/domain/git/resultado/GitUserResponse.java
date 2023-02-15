package br.com.capitani.api.domain.git.resultado;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GitUserResponse implements Serializable {
    private String login;
    private Long id;
    private String node_id;
    private String avatar_url;
    private String gravatar_id;
    private String url;
    private String html_url;
    private String followers_url;
    private String following_url;
    private String gists_url;
    private String starred_url;
    private String subscriptions_url;
    private String organizations_url;
    private String repos_url;
    private String events_url;
    private String received_events_url;
    private String type;
    private Boolean site_admin;
    private String name;
    private String company;
    private String blog;
    private String location;
    private String email;
    private Boolean hireable;
    private String bio;
    private String twitter_username;
    private Integer public_repos;
    private Integer public_gists;
    private Integer followers;
    private Integer following;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public GitUserModel toModel(GitUserResponse gitUserResponse) {
        return GitUserModel.builder()
                .idGit(gitUserResponse.getId())
                .login(gitUserResponse.getLogin())
                .name(gitUserResponse.getName())
                .avatarUrl(gitUserResponse.getAvatar_url())
                .gravatarId(gitUserResponse.getGravatar_id())
                .url(gitUserResponse.getUrl())
                .htmlUrl(gitUserResponse.getHtml_url())
                .followersUrl(gitUserResponse.getFollowers_url())
                .followingUrl(gitUserResponse.getFollowing_url())
                .gistsUrl(gitUserResponse.getGists_url())
                .starredUrl(gitUserResponse.getStarred_url())
                .subscriptionsUrl(gitUserResponse.getSubscriptions_url())
                .organizationsUrl(gitUserResponse.getOrganizations_url())
                .reposUrl(gitUserResponse.getRepos_url())
                .eventsUrl(gitUserResponse.getEvents_url())
                .receivedEventsUrl(gitUserResponse.getReceived_events_url())
                .type(gitUserResponse.getType())
                .siteAdmin(gitUserResponse.getSite_admin())
                .name(gitUserResponse.getName())
                .company(gitUserResponse.getCompany())
                .blog(gitUserResponse.getBlog())
                .location(gitUserResponse.getLocation())
                .email(gitUserResponse.getEmail())
                .hireable(gitUserResponse.getHireable())
                .bio(gitUserResponse.getBio())
                .twitterUsername(gitUserResponse.getTwitter_username())
                .publicRepos(gitUserResponse.getPublic_repos())
                .publicGists(gitUserResponse.getPublic_gists())
                .followers(gitUserResponse.getFollowers())
                .following(gitUserResponse.getFollowing())
                .createdAt(gitUserResponse.getCreated_at())
                .updatedAt(gitUserResponse.getUpdated_at())
                .dataConsulta(LocalDateTime.now())
                .build();
    }
}
