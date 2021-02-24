package com.example.workshop01.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository
        extends JpaRepository<MyUser, Integer> {

    List<MyUser> findAllByNameAndAgeGreaterThan(String name, int age);
}
