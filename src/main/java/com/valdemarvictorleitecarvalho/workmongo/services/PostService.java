package com.valdemarvictorleitecarvalho.workmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdemarvictorleitecarvalho.workmongo.domain.Post;
import com.valdemarvictorleitecarvalho.workmongo.repository.PostRepository;
import com.valdemarvictorleitecarvalho.workmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
}