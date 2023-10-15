package edu.bu.met.cs665.GenerateEmail;

public abstract class Customer {
    protected String name;
    protected String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract String generateEmail();
}