package com.spring.learn.service;

import com.spring.learn.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    private final HelloRepository helloRepository;

    @Autowired
    public HelloServiceImpl(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    @Override
    public String hello() {
        return helloRepository.helloFromDB();
    }
}
