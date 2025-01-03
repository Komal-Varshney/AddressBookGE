import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook<Contact> a1 = new AddressBook<>();
        a1.adBook.add(new Contact("a","a","a","a","a",12,15));
        a1.adBook.add(new Contact("b","b","b","b","b",13,16));
        a1.adBook.add(new Contact("c","c","c","c","c",14,17));
        a1.adBook.add(new Contact("d","d","d","d","d",15,18));
        a1.adBook.add(new Contact("e","e","e","e","e",17,19));
        a1.adBook.add(new Contact("f","f","","f","f",20,21));
        a1.adBook.add(new Contact("g","g","g","g","g",22,23));
        a1.adBook.add(new Contact("h","h","h","h","h",22,23));
        a1.adBook.add(new Contact("i","i","i","i","i",23,24));
        a1.adBook.add(new Contact("j","j","j","j","j",34,35));
        a1.adBook.add(new Contact("k","k","k","k","k",36,67));



        int i = 1;

        LinkedListDemo<Contact> l1 = new LinkedListDemo<>();
//        LinkedListDemo<BusinessContact> l2 = new LinkedListDemo<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address book");
        do {
            System.out.println("Enter 1 to create contact \nEnter 2 to display al contacts \nEnter 3 to search \nEnter 4 to display migrate list");
            int input = sc.nextInt();
            switch (input) {
                case 1 -> a1.createContact(createContact());
                case 2 -> a1.display();
                case 3 ->a1.search();
                case 4 -> l1.printMigrateList();
                default -> System.out.println("Wrong input");
            }
            System.out.println("Enter 0 to exit");
            i = sc.nextInt();

        } while (i != 0);

        System.out.println("Thank you for using address book");
        sc.close();
    }

    public static Contact createContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter last name");
        String lname = sc.next();
        System.out.println("Enter city");
        String city = sc.next();
        System.out.println("Enter state");
        String state = sc.next();
        System.out.println("Enter email");
        String email = sc.next();
        System.out.println("Enter phone");
        int phone = sc.nextInt();
        System.out.println("Enter name");
        int zip = sc.nextInt();
        Contact c1 = new Contact(name, lname, city, state, email, phone, zip);
        return c1;
    }

    public static BusinessContact createBusinessContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Company name ");
        String cname = sc.next();
        System.out.println("Employee Name");
        String ename = sc.next();
        System.out.println("Employee mail");
        String bmail= sc.next();

        BusinessContact b1 = new BusinessContact(cname,ename,bmail);
        return b1;
    }
}