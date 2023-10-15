package edu.bu.met.cs665.GenerateEmail;

public class ReturningCustomer extends Customer {
    public ReturningCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    public String generateEmail() {
        return "Dear " + name + ",\n\n" +
                "Welcome back to TechCorp! We appreciate your continued patronage. As a returning customer, you are part of our valued community, and we're here to support you in any way we can.\n\n" +
                "If there's anything specific you'd like to discuss or if you have any questions, please don't hesitate to get in touch.\n\n" +
                "Sincerely,\n" +
                "TechCorp";
    }
}

