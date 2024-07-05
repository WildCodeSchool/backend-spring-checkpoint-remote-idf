package checkpoint.spring.remote.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH, optional = false)
    @JoinColumn(name = "post_id" , nullable = false)
    @JsonIgnore
    private Post post;

    public Long getId() {
        return id;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Comment() {}
    public Comment(String message, Post post) {
        this.message = message;
        this.post = post;
    }

    public Comment(String message) {
        this.message = message;
    }
}
