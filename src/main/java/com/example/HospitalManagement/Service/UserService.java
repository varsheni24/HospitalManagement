package com.example.HospitalManagement.Service;

import com.example.HospitalManagement.Entity.UserAccess;
import com.example.HospitalManagement.Repo.UserAccessRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserAccessRepo userAccessRepo;

    public String getRoleByUserNameAndPassword(String userName, String password) {
        UserAccess userAccess = userAccessRepo.findByUserNameAndPassword(userName, password);

        if (userAccess != null && userAccess.getUserRole() != null) {
            return "Welcome " + userAccess.getUserRole().getRoleName();
        }
        return "Invalid username or password";
    }
}