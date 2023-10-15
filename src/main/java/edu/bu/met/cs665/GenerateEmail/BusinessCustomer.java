package edu.bu.met.cs665.GenerateEmail;

public class BusinessCustomer extends Customer {
    public BusinessCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    public String generateEmail() {
        return "Dear " + name + ",\n\n" +
                "Thank you for choosing TechCorp for your business needs. We understand the importance of your operations and are committed to providing you with top-notch solutions.\n\n" +
                "Should you have any questions or need further assistance, please feel free to reach out to us.\n\n" +
                "Sincerely,\n" +
                "TechCorp";
    }
}


