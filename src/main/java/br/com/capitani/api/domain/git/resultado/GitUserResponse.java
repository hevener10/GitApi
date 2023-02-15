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
    private String nodeId;
    private String getAvatar_url;
    private String gravatarId;
    private String url;
    private String htmlUrl;
    private String followersUrl;
    private String followingUrl;
    private String gistsUrl;
    private String starredUrl;
    private String subscriptionsUrl;
    private String organizationsUrl;
    private String reposUrl;
    private String eventsUrl;
    private String receivedEventsUrl;
    private String type;
    private Boolean siteAdmin;
    private String name;
    private String company;
    private String blog;
    private String location;
    private String email;
    private Boolean hireable;
    private String bio;
    private String twitterUsername;
    private Integer publicRepos;
    private Integer publicGists;
    private Integer followers;
    private Integer following;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
