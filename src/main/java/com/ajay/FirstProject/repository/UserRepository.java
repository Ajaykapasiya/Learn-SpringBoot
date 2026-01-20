package com.ajay.FirstProject.repository;


import com.ajay.FirstProject.entity.JournalEntry;
import com.ajay.FirstProject.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String username);

}

