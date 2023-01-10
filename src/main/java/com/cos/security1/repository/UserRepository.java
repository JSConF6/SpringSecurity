package com.cos.security1.repository;

import com.cos.security1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// CRUD 함수를 JpaRepository가 들고 있다.
// @Repository라는 어노테이션이 없어도 IoC가 된다. 이유는 JpaRepository를 상속했기 때문
public interface UserRepository extends JpaRepository<User, Long> {

    // findBy규칙 -> username문법
    // select * from user where username = ?
    public User findByUsername(String username); // Jpa Query methods
}
