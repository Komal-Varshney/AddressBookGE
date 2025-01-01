import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<Contact> adb = new ArrayList<>();

    public void addContacts(Contact c1){
        adb.add(c1);
        System.out.println("Contact added");
    }
}

