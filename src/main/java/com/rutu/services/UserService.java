package com.rutu.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.rutu.model.User;
import com.rutu.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	public List<User> getAllUser(){
		return (List<User>) userRepository.findAll();
	}
	public Optional<User> getUserById(Integer id){
		return userRepository.findById(id);
	}
	public void saveMyUser(User user) {
		userRepository.save(user);
	}
	public String delUserById(Integer id) {
		userRepository.deleteById(id);
		return "";
	}

}
