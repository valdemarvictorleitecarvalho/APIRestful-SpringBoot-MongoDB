package com.valdemarvictorleitecarvalho.workmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdemarvictorleitecarvalho.workmongo.domain.User;
import com.valdemarvictorleitecarvalho.workmongo.repository.UserRepository;
import com.valdemarvictorleitecarvalho.workmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
}