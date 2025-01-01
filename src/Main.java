import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AddressBook abd1 = new AddressBook();
        int i = 1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter 1 to create contact");
            int input = sc.nextInt();
            switch(input){
                case 1 -> createContact(abd1);
                default -> System.out.println("Please enter a valid input");
            }
            System.out.println("Enter 0 to exit");
            i = sc.nextInt();
        }while(i!=0);
        System.out.println("Thanx for using ");
        sc.close();
    }

    static AddressBook createContact(AddressBook abd1){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name");
        String fname = sc.next();
        System.out.println("Enter the last name");
        String lname = sc.next();
        System.out.println("Enter your city");
        String city = sc.next();
        System.out.println("Enter your state");
        String state = sc.next();
        System.out.println("Enter your email");
        String email = sc.next();
        System.out.println("Enter zipcode");
        int zip = sc.nextInt();
        System.out.println("Enter phone number");
        int phone = sc.nextInt();
        Contact c1 = new Contact(fname,lname,city,state,email,zip,phone);
        abd1.addContacts(c1);
        sc.close();
        return abd1;

    }

}