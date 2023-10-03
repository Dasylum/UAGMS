package com.example.uagms.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class UserGroupKey implements Serializable {
    @Column(name = "user_id")
    UUID user_id;

    public UserGroupKey(UUID user_id, UUID group_id) {
        this.user_id = user_id;
        this.group_id = group_id;
    }

    public UserGroupKey() {}

    @Column(name = "group_id")
    UUID group_id;
}
