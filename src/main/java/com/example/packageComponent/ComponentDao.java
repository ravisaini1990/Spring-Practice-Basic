package com.example.packageComponent;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDao {

    @Autowired
    ComponentJdbcConnection connection;

    public void jdbcConnection() {
        connection.connect();
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct ComponentDao");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy ComponentDao");
    }
}
