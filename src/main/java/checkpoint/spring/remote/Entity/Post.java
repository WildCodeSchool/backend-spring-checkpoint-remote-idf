package checkpoint.spring.remote.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    private String imageUrl;
    private String author;
    private boolean commentIsVisible;
    @OneToMany(mappedBy = "post")
    private List<Comment> comments;



    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isCommentIsVisible() {
        return commentIsVisible;
    }

    public void setCommentIsVisible(boolean commentIsVisible) {
        this.commentIsVisible = commentIsVisible;
    }
    public List<Comment> getComments() {
        return comments;
    }
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Post() {
    }

    public Post(String message, String imageUrl, String author, boolean commentIsVisible) {
        this.message = message;
        this.imageUrl = imageUrl;
        this.author = author;
        this.commentIsVisible = commentIsVisible;
    }
}
