package edu.bu.met.cs665.GenerateEmail;

public class FrequentCustomer extends Customer {
    public FrequentCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    public String generateEmail() {
        return "Dear " + name + ",\n\n" +
                "We greatly appreciate your frequent visits to TechCorp and want to extend our sincere thanks for your continued support. Your loyalty means a lot to us, and we're committed to ensuring you have the best experience possible.\n\n" +
                "If there's anything specific you'd like to discuss or if you have any suggestions, please feel free to let us know.\n\n" +
                "Sincerely,\n" +
                "TechCorp";
    }
}
