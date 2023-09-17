package com.example.uagms.models;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "`Groups`")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    LocalDateTime created_at;

    LocalDateTime deleted_at;

    private Boolean is_deleted;

    LocalDateTime updated_at;

    @OneToMany(mappedBy = "groups")
    private List<User> users;

    public Group() {
        this.setIs_deleted(false);
    }

    @PrePersist
    protected void onCreate() {
        this.created_at = this.updated_at = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updated_at = LocalDateTime.now();
    }

    public UUID getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public LocalDateTime getCreated_at() {
        return this.created_at;
    }

    public LocalDateTime getDeleted_at() {
        return this.deleted_at;
    }

    public Boolean getIs_deleted() {
        return this.is_deleted;
    }

    public LocalDateTime getUpdated_at() {
        return this.updated_at;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public void setDeleted_at(LocalDateTime deleted_at) {
        this.deleted_at = deleted_at;
    }

    public void setIs_deleted(Boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}