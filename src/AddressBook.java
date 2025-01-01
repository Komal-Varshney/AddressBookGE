import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook <PlaceHolder> {
//    List<Contact> adBook = new ArrayList<>();
    List<PlaceHolder> adBook = new ArrayList<>();

    public void display(){
        System.out.println(adBook);
    }

    public void createContact(PlaceHolder c1){
        adBook.add((PlaceHolder) c1);
    }

}

