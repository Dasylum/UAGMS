package com.example.uagms.services;

import com.example.uagms.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.uagms.models.User;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

//    public User findUserById(UUID userId) {
//        return userRepository.findByUserId(userId);
//    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    /**
     * This method creates the user if it doesn't exist in UMS database
     * @param user_id
     * @param user_name
     * @param password
     */
    public void syncUser(UUID user_id, String user_name, String password) {
        User newUser = new User();
        newUser.setUser_id(user_id);
        newUser.setUser_name(user_name);
        newUser.setPassword(password);

        this.createUser(newUser);
    }

//    public List<User> getUserGroups()
}
