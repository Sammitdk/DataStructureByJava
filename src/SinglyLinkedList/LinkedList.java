package SinglyLinkedList;
public class LinkedList
{
    private Node head;
    private Node tail;
    private int size;
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }
    public void insertLast(int value)
    {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        node.next = null;
        size++;
    }
    public void insertAt(int value,int index)
    {
        if(index == 0)
        {
            insertFirst(value);
            return;
        }
        if(index == size)
        {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i< index; i++)
        {
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }
     public void print()
    {
        Node temp = head;
        System.out.print("[ ");
        while (temp != null)
        {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.print("]");
    }
    public LinkedList()
    {
        this.size = 0;
    }
    private class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value = value;
        }
        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }
}
