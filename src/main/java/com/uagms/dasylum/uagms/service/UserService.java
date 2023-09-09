package com.uagms.dasylum.uagms.service;
import com.uagms.dasylum.uagms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uagms.dasylum.uagms.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Create a new user
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        List<User> temp = new ArrayList<>();
        try {
            temp= userRepository.findAll();

        } catch (Exception e) {
            System.out.println(e);
        }
        return temp;
    }

    // Get user by ID
    public Optional<User> getUserById(UUID id) {
        return userRepository.findById(id);
    }

    // Update user
    public User updateUser(UUID id, User userDetails) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            User existingUser = user.get();
            existingUser.setUsername(userDetails.getUsername());
            return userRepository.save(existingUser);
        }
        return null;
    }

    // Delete all users
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

    // Delete user
    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }

    // Other business logic related to users
}
