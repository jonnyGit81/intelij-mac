package com.company;

import java.io.Serializable;

public class Product implements MyInterface, Serializable {
    private String name;

    @Override
    public void calc() {
      name = "abc";
    }

    @Override
    public String toString() {
        System.out.printf("Haha");
        return super.toString();
    }
}
