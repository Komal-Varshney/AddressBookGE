public class LinkedList <T>{
    Node<T> head = null;
    Node<T> current = null;

    public void add(T a){
        Node<T> a1 = new Node<>(a);
        if(head == null){
            head = a1;
        }
        else{
            current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next=a1;
        }
    }

    public void display(){
        if(head == null){
            System.out.println("Linked List is empty");
        }
        else{
            current = head;
            while(current!=null){
                System.out.println(current);
                current=current.next;
            }
        }
    }
}
