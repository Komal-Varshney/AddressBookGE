import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Contact> adBook = new ArrayList<>();

    public void display(){
        System.out.println(adBook);
    }

    public void createContact(){
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
        String zip = sc.next();
        System.out.println("Enter phone number");
        String phone = sc.next();
        Contact c1 = new Contact(fname,lname,city,state,email,zip,phone);
        adBook.add(c1);
//        sc.close();
    }

}

