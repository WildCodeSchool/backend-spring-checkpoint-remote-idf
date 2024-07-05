package checkpoint.spring.remote.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")

public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String firstname;

    private String lastname;

    public User() {
    }

    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String setFirstName(String firstname) {
        return this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String setLastname(String lastname) {
        return this.lastname = lastname;
    }
}
