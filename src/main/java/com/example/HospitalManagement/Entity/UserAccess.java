package com.example.HospitalManagement.Entity;

import jakarta.persistence.*;
import lombok.Data;


import java.util.Date;

@Entity
@Table(name = "user_access")
@Data
public class UserAccess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "started_date")
    private Date startedDate;

    @Column(name = "ended_date")
    private Date endedDate;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private UserRole userRole;
}

