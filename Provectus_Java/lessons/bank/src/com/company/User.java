package com.company;

/**
 * Created by galina on 01.02.17.
 */
public class User {
    private String name;

    private GetMoney listener;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public GetMoney getListener() {
        return listener;
    }

    public void setListener(GetMoney listener) {
        this.listener = listener;
    }
}
