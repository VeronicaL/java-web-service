package com.epam.user.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class User {

    @NotNull
    private String name;
    @NotNull
    private String secondname;
    @NotNull
    private String email;

    public User(String name, String secondname, String email) {
        this.name = name;
        this.secondname = secondname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondname;
    }

    public void setSecondName(String secondname) {
        this.secondname = secondname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
