package com.rutu.repository;

import org.springframework.data.repository.CrudRepository;
import com.rutu.model.User;


public interface UserRepository extends CrudRepository<User,Integer>{

}
