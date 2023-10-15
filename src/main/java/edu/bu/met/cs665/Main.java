package edu.bu.met.cs665;

import java.util.Scanner;

import edu.bu.met.cs665.GenerateEmail.BusinessCustomer;
import edu.bu.met.cs665.GenerateEmail.Customer;
import edu.bu.met.cs665.GenerateEmail.FrequentCustomer;
import edu.bu.met.cs665.GenerateEmail.NewCustomer;
import edu.bu.met.cs665.GenerateEmail.ReturningCustomer;
import edu.bu.met.cs665.GenerateEmail.VipCustomer;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to TechCorp Email Generation!");

        while (true) {
            System.out.println("\nSelect Customer Type:");
            System.out.println("1. Business Customer");
            System.out.println("2. Returning Customer");
            System.out.println("3. Frequent Customer");
            System.out.println("4. New Customer");
            System.out.println("5. VIP Customer");
            System.out.println("0. Exit\n");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            if (choice == 0) {
                break; 
            }

            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();

            System.out.print("Enter customer email: ");
            String email = scanner.nextLine();

            Customer customer = null;

            switch (choice) {
                case 1:
                    customer = new BusinessCustomer(name, email);
                    break;
                case 2:
                    customer = new ReturningCustomer(name, email);
                    break;
                case 3:
                    customer = new FrequentCustomer(name, email);
                    break;
                case 4:
                    customer = new NewCustomer(name, email);
                    break;
                case 5:
                    customer = new VipCustomer(name, email);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            if (customer != null) {
                String customerEmail = customer.generateEmail();
                System.out.println("\nGenerated Email:\n\n" + customerEmail);
            }
        }

        scanner.close();
    }
}
