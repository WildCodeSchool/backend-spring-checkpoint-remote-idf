package checkpoint.spring.remote.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    private String imageUrl;

    public Post() {

    }

    public Post(String message, String imageUrl){
        this.message = message;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return this.id;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getImage() {
        return this.imageUrl;
    }

    public void setImage(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
