import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkedListDemo <T>{

    LinkedList<T> migrateList = new LinkedList<>();

    public static void main(String[] args){
        ArrayList<Integer>a1 = new ArrayList<>();
        a1.add(10);
        a1.add(24);
        a1.add(30);
        a1.add(17);
        a1.add(50);
        a1.add(56);
        a1.add(67);
        a1.add(12);
        a1.add(45);
        a1.add(77);
        a1.add(33);
        a1.add(40);
        a1.add(55);
        a1.add(9);
        a1.add(39);
        a1.add(49);
        a1.add(16);
        a1.add(39);
        a1.add(49);
        a1.add(16);
        a1.add(22);
        a1.add(31);
        a1.add(22);
        a1.add(31);
        a1.add(98);
        a1.add(87);
        a1.add(76);
        a1.add(69);
        a1.add(92);

        // sort thr array but keep the insertion order same?
        // either you can create array and display the sorted or go on each element and print it -> two issues will arise
        // i) will only print numbers not array, ii) will use double


//        a1.stream().sorted().forEach(System.out::println);
//        a1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        // if we want to print only first 5 sorted numbers
//        a1.stream().sorted(Comparator.reverseOrder()).limit(5).forEach(System.out::println);
        // limit - work same the sql limit function
//        System.out.println(a1);


        // now if the list have duplicates then how can we remove them?
        // we'll use distinct function


//        a1.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
        // limit - work same the sql limit function
//        System.out.println(a1);

        // how to find the odd number
//        a1.stream().filter(i-> i%2 == 0).sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
//        System.out.println(a1);

        // storing in a list
//        List<Integer>updatedList = a1.stream().filter(i->i%2==0).sorted().distinct().toList();
//        List<Integer>updatedList = a1.stream().filter(i->i%2==0).sorted().distinct().collect(Collectors.toList());

        List<Integer>updatedList = a1.stream().filter(i->i%2==0).map(i->i+10).sorted().distinct().collect(Collectors.toList());
        System.out.println(updatedList);

        // Basic stream functionality.





//        Stream<Integer> a = a1.stream();
//        a.forEach(System.out::println);
//        a.forEach(System.out.println);
        // it will give error because stream object has used and once it use and get closed you can't use it again.
        // The stream is referring to the pipeline once a particular thing is completed in pipeline it get flushed out .
        // benefit of using one time data ->
    }


//    public void migrate(AddressBook<T>a){
//
//        for(T c : a.adBook){
//            migrateList.add(c);
//        }
//    }

    public void printMigrateList(){
        migrateList.display();
    }
}
