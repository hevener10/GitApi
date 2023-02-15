package br.com.capitani.api.domain.git.resultado;

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
    private UUID id;
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @EqualsAndHashCode.Include

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
}
