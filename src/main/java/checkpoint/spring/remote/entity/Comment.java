package checkpoint.spring.remote.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String message;

    @ManyToOne
    @JoinColumn(name = "feeds_id")
    private Feed feeds;

    public Comment() {
    }

    public Comment(String message, Feed feeds) {
        this.message = message;
        this.feeds = feeds;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Feed getFeeds() {
        return feeds;
    }

    public void setFeeds(Feed feeds) {
        this.feeds = feeds;
    }

}
