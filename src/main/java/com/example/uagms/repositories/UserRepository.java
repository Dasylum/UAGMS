package com.example.uagms.repositories;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.uagms.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
//    User findByUserId(UUID user_id);
}
