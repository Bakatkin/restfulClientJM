package com.bakatkin.crud.repository;


import com.bakatkin.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    @Query("FROM User u JOIN FETCH u.roles r where u.name = :name")
    User findByUserName(String name);
}
