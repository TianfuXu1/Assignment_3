package edu.bu.met.cs665.GenerateEmail;

public class NewCustomer extends Customer {
    public NewCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    public String generateEmail() {
        return "Dear " + name + ",\n\n" +
                "A warm welcome to TechCorp! We're thrilled to have you on board and look forward to serving you. If there's anything specific you'd like to know or discuss as a new customer, please don't hesitate to reach out.\n\n" +
                "Thank you for choosing TechCorp!\n\n" +
                "Sincerely,\n" +
                "TechCorp";
    }
}


