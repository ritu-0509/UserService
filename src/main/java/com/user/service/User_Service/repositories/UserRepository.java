package com.user.service.User_Service.repositories;

import com.user.service.User_Service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String>{

}
