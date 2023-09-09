package com.uagms.dasylum.uagms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uagms.dasylum.uagms.model.User;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
