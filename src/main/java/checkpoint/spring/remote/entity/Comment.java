package checkpoint.spring.remote.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    
    @JsonIncludeProperties(value = {"id"})
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    public Comment() {

    }

    public Comment(String message){
        this.message = message;
    }

    public Comment(String message, Post post){
        this.message = message;
        this.post = post;
    }

    public Long getId() {
        return this.id;
    }

    public String getMessage() {
        return this.message;
    }

    public void setmessage(String message) {
        this.message = message;
    }

    public Post getPost() {
        return this.post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
