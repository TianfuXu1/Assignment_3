package edu.bu.met.cs665.GenerateEmail;

public class VipCustomer extends Customer {
    public VipCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    public String generateEmail() {
        return "Dear " + name + ",\n\n" +
                "You are a valued VIP customer at TechCorp, and we want to extend our heartfelt thanks for your exceptional support. Your satisfaction is our top priority, and we're here to ensure you receive the best service possible.\n\n" +
                "If there's anything specific you'd like to discuss or if you have any special requests, please feel free to let us know.\n\n" +
                "Sincerely,\n" +
                "TechCorp";
    }
}
