package com.example.uagms.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class UserGroup {
    @EmbeddedId
    UserGroupKey id;

    @ManyToOne
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @MapsId("group_id")
    @JoinColumn(name = "group_id")
    Group group;

    private LocalDateTime created_at;
    private LocalDateTime deleted_at;
    private LocalDateTime updated_at;

    public void setId(UserGroupKey id) {
        this.id = id;
    }

    private Boolean is_deleted;

    public UserGroup(UUID user_id, UUID group_id) {
        this.id = new UserGroupKey(user_id, group_id);
        this.is_deleted = false;
    }

    public UserGroup() {}

    @PrePersist
    protected void onCreate() {
        this.created_at = this.updated_at = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updated_at = LocalDateTime.now();
    }

    public UserGroupKey getId() {
        return id;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Group getGroup() {
        return this.group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(LocalDateTime deleted_at) {
        this.deleted_at = deleted_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public Boolean getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Boolean is_deleted) {
        this.is_deleted = is_deleted;
    }
}
