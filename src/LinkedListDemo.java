public class LinkedListDemo <T>{

    LinkedList<T> migrateList = new LinkedList<>();

    public void migrate(AddressBook<T>a){

        for(T c : a.adBook){
            migrateList.add(c);
        }
    }

    public void printMigrateList(){
        migrateList.display();
    }
}
