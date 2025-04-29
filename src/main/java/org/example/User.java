package org.example;

public abstract class User {
private int id;
private String name;


private static int nextId = 1; //use to generate unique IDs foe each new user
    public User (String name) {
        this.id = nextId++;
        this.name = name;

    }
    // Getter for id field( no setter to protect the id from being changed)
    public int getId() {
        return id;
    }
    // Getter and setter for name field
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by subclasses
    public abstract String getRole();

    // toString() method for readable output
    @Override
    public  String toString() {
        return getRole() + "[ID=" + id + ", Name=" + name + "]";
    }

}
