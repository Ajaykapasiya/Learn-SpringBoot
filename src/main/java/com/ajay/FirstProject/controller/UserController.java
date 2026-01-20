package com.ajay.FirstProject.controller;

import com.ajay.FirstProject.entity.JournalEntry;
import com.ajay.FirstProject.entity.User;
import com.ajay.FirstProject.service.JournalEntryService;
import com.ajay.FirstProject.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userservice;

    @GetMapping
    public List<User> getAllUser(){
         return userservice.getAll();
    }


    @PostMapping
    public void createUser(@RequestBody User user){
    userservice.saveEntry(user);
    }


@PutMapping
    public ResponseEntity<?> updateUser(@RequestBody User user){
        User userInDb = userservice.findByUserName(user.getUserName());
        if (userInDb != null){
            userInDb.setUserName(user.getUserName());
            userInDb.setPassword(user.getPassword());
            userservice.saveEntry(userInDb);
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

}
}