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

    @Column(name = "group_id")
    UUID group_id;


}
