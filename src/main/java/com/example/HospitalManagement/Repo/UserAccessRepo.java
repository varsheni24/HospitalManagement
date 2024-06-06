package com.example.HospitalManagement.Repo;

import com.example.HospitalManagement.Entity.UserAccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccessRepo extends JpaRepository<UserAccess, Long> {
    UserAccess findByUserNameAndPassword(String userName, String password);
}
