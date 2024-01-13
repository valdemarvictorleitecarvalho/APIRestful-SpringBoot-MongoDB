package com.valdemarvictorleitecarvalho.workmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.valdemarvictorleitecarvalho.workmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
