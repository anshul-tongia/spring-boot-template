package com.spring.learn.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepositoryImpl implements HelloRepository{
    @Override
    public String helloFromDB() {
        return "Hello From Database!!";
    }
}
