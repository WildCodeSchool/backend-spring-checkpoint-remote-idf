package checkpoint.spring.remote.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String firstname;

    private String Lastname;

    public User(String firstname, String lastname) {
        this.firstname = firstname;
        Lastname = lastname;
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
        return Lastname;
    }

    public String setLastname(String lastname) {
        return Lastname = lastname;
    }
}
