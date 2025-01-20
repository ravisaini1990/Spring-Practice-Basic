package com.example.cdi_implementation;


import javax.inject.Named;

@Named
public class CdiDao {

    public void getDao() {
        System.out.println("CDI Dao Instance");
    }
}
