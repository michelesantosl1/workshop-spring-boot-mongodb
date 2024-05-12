package com.michelesilva.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michelesilva.workshopmongo.domain.User;
import com.michelesilva.workshopmongo.repository.UserRepository;
import com.michelesilva.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	//return user;
}
