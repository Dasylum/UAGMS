package com.uagms.dasylum.uagms.model;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name="userName")
    private String userName;
    @Column(name="password")
    private String password;
    @Column(name="create_at")
    private String created_at;
    @Column(name="updated_at")
    private String updated_at;
    @Column(name="deleted_at")
    private String deleted_at;
    @Column(name="isDeleted")
    private boolean isDeleted;

    public User() {

    }
    // Constructors, Getters, and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
