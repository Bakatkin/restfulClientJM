package com.bakatkin.SpringBootCRUD.web.repository;

import com.bakatkin.SpringBootCRUD.web.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
    @Query("from roles r where r.role = :name")
    Role findOneByName (String name);
}
