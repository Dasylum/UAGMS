package com.example.uagms.repositories;

import com.example.uagms.models.UserGroup;
import com.example.uagms.models.UserGroupKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGroupRepository extends JpaRepository<UserGroup, UserGroupKey> {
}
