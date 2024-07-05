package checkpoint.spring.remote.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue
    private Long id;

    private String message;

    private String imageUrl;

    public Post() {
    }

    public Post(String message, String imageUrl) {
        this.message = message;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String setMessage(String message) {
        return this.message = message;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String setImageUrl(String imageUrl) {
        return this.imageUrl = imageUrl;
    }
}
