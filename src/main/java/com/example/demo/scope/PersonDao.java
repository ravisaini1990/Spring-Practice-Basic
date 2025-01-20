package com.example.demo.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {

    @Autowired
    JdbcConnection connection;

    public void jdbcConnection() {
        connection.connect();
    }
}
