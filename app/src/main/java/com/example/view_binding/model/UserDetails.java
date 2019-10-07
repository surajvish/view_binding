package com.example.view_binding.model;

public class UserDetails {
    private String name;
    private String age;

    public UserDetails(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
