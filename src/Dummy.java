import java.util.HashSet;
import java.util.Set;

public class Dummy {
    public static void main(String[] args) {
//        Contact c1 = new Contact("a","a","a","a","a",12,12);
//        Contact c2 = new Contact("a","a","a","a","a",12,12);
//
//        Set<Contact> st = new HashSet<>();
//        st.add(c1);
//        st.add(c2);

        // another object with reference to the new keyword, so when we store complex in the hashset it compares the hashcode and creates the hashing function of the hash code generated.

        // we can't create object of interface. It doesn't have implementation

// here we can create object interface by using lambda -> you can pass the parameter -> you can pass the body -> ()-{} -> these are called anonymous function.
        Printable p1 = (a) -> {
            System.out.println("Hello");
            System.out.println("Somebody is good");
            System.out.println(a);
        };
        // what happens internally these parameter and body pass to this ->   public void print(); method
        // if     public void print(int a );  -> Printable p = (b)->{};

        Dummy d = new Dummy();
        d.display(p1);
    }

    public void display(Printable p){
        p.print(8);
    }

}
