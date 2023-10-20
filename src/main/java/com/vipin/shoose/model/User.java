package com.vipin.shoose.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotNull
    @Column(unique = true)
    private String username;
    @Column(unique = true)
    @NotNull
    private String email;
    @NotNull
    private String phoneNumber;
    private  String password;
    private  String roles;
    private  boolean isEnabled=false;
    private  LocalDateTime createdTime;
}
