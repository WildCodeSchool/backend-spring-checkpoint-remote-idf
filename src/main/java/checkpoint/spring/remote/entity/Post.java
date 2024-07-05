package com.wild.checkpoint.demo.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    String message;
    String imageUrl;
    Boolean commentIsVisible = false;

    @OneToMany(mappedBy = "posts")
    List<Comment> comments = new ArrayList<Comment>();

    @ManyToOne()
    @JoinColumn(name = "user_id")
    User author;

    public Posts() {}

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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getCommentIsVisible() {
        return commentIsVisible;
    }

    public void setCommentIsVisible(Boolean commentIsVisible) {
        this.commentIsVisible = commentIsVisible;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}