package com.edigest.myFirstProject.respository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.edigest.myFirstProject.entity.User;

public interface UserRepository extends MongoRepository<User,ObjectId>{
    User findByUserName(String username);

    void deleteByUserName(String username);
}
