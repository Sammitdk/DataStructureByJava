package SinglyLinkedList;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList a = new LinkedList();
        a.insertFirst(10);
        a.insertFirst(20);
        a.insertFirst(30);
        a.insertFirst(2);
        a.insertLast(5);
        a.insertAt(69,2);
        a.print();
    }
}
