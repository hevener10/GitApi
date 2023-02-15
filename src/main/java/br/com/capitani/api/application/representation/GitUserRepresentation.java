package br.com.capitani.api.application.representation;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GitUserRepresentation {
    private UUID id;

    private Long idGit;

    private String login;

    private String nodeId;

    private String avatarUrl;


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


    private boolean siteAdmin;

    private String name;

    private String company;

    private String blog;

    private String location;

    private String email;

    private Boolean hireable;

    private String bio;


    private String twitterUsername;


    private int publicRepos;


    private int publicGists;

    private int followers;

    private int following;


    private LocalDateTime createdAt;


    private LocalDateTime updatedAt;

    private LocalDateTime dataConsulta;
}
