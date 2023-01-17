package com.example.SmallWebApp.dao;
import org.springframework.data.repository.CrudRepository;

import com.example.SmallWebApp.UserRegistration;
public interface UserRepo extends CrudRepository<UserRegistration,Long> {

}
