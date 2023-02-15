package br.com.capitani.api.domain.git.resultado;

import br.com.capitani.api.application.representation.GitUserRepresentation;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@Audited
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "git_resultado", schema = "git")
public class GitUserModel implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @EqualsAndHashCode.Include
    private UUID id;

    @Column(name = "id_git")
    private Long idGit;
    private String login;

    @Column(name = "node_id")
    private String nodeId;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "gravatar_id")
    private String gravatarId;

    private String url;

    @Column(name = "html_url")
    private String htmlUrl;

    @Column(name = "followers_url")
    private String followersUrl;

    @Column(name = "following_url")
    private String followingUrl;

    @Column(name = "gists_url")
    private String gistsUrl;

    @Column(name = "starred_url")
    private String starredUrl;

    @Column(name = "subscriptions_url")
    private String subscriptionsUrl;

    @Column(name = "organizations_url")
    private String organizationsUrl;

    @Column(name = "repos_url")
    private String reposUrl;

    @Column(name = "events_url")
    private String eventsUrl;

    @Column(name = "received_events_url")
    private String receivedEventsUrl;

    private String type;

    @Column(name = "site_admin")
    private boolean siteAdmin;

    private String name;

    private String company;

    private String blog;

    private String location;

    private String email;

    private Boolean hireable;

    private String bio;

    @Column(name = "twitter_username")
    private String twitterUsername;

    @Column(name = "public_repos")
    private int publicRepos;

    @Column(name = "public_gists")
    private int publicGists;

    private int followers;

    private int following;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    private LocalDateTime dataConsulta;

    public GitUserRepresentation toRepresentation(GitUserModel github) {
        return GitUserRepresentation.builder()
                .id(github.getId())
                .idGit(github.getIdGit())
                .login(github.getLogin())
                .name(github.getName())
                .avatarUrl(github.getAvatarUrl())
                .gravatarId(github.getGravatarId())
                .url(github.getUrl())
                .htmlUrl(github.getHtmlUrl())
                .followersUrl(github.getFollowersUrl())
                .followingUrl(github.getFollowingUrl())
                .gistsUrl(github.getGistsUrl())
                .starredUrl(github.getStarredUrl())
                .subscriptionsUrl(github.getSubscriptionsUrl())
                .organizationsUrl(github.getOrganizationsUrl())
                .reposUrl(github.getReposUrl())
                .eventsUrl(github.getEventsUrl())
                .receivedEventsUrl(github.getReceivedEventsUrl())
                .type(github.getType())
                .siteAdmin(github.isSiteAdmin())
                .company(github.getCompany())
                .blog(github.getBlog())
                .location(github.getLocation())
                .email(github.getEmail())
                .hireable(github.getHireable())
                .bio(github.getBio())
                .twitterUsername(github.getTwitterUsername())
                .publicRepos(github.getPublicRepos())
                .publicGists(github.getPublicGists())
                .followers(github.getFollowers())
                .following(github.getFollowing())
                .createdAt(github.getCreatedAt())
                .updatedAt(github.getUpdatedAt())
                .dataConsulta(github.getDataConsulta())
                .build();
    }
}
