package com.example.simpledockerfileexample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;


@Service
public class ClientService {

    @Value("${client}")
    private String client;

    public String sayHello(){
        return "Hello!: " + client;
    }
}