import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook <PlaceHolder extends Dummy1> {
//    List<Contact> adBook = new ArrayList<>();
    List<PlaceHolder> adBook = new ArrayList<>();

    public void display(){
        System.out.println(adBook);
    }

    public void createContact(PlaceHolder c1){
        adBook.add((PlaceHolder) c1);
    }

    public void search(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name to search");
        String s1 = sc.next();
        adBook.stream().filter(i->i.getFirstName().equalsIgnoreCase(s1)).forEach(System.out::println);
    }


}

