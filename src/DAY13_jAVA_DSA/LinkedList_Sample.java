package DAY13_jAVA_DSA;

public class LinkedList_Sample {

    private static Node head;
    private static Node tail;
    private static int size;

    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public LinkedList_Sample() {
        head = null;
        tail = null;
        size = 0;
    }

    public void insertFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            insertFront(data);
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;

    }

    public void insertPosition(int data, int index) {
        Node newNode = new Node(data);
        if (head == null) {
            insertFront(data);
        } else if (index == size) {
            insertLast(data);
        }
        if (index < 0 || index > size) {
            System.err.println("Invalid index");
        } else {
            Node temp = head;
            int count = 0;
            while (count < index - 1) {
                temp = temp.next;
                count++;
                System.out.println("value" + temp.val);
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

    }

    public int getElement(int index) {
        Node temp = head;
        if (index < 0 || index > size) {
            System.err.println("Invalid index");
        } else {

            int count = 0;
            while (count < index) {
                temp = temp.next;
                count++;
            }

        }
        return temp.val;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList_Sample l1 = new LinkedList_Sample();
        l1.insertFront(5);
        l1.insertFront(15);
        l1.insertFront(25);
        l1.insertLast(55);
        l1.insertPosition(85, 2);
        l1.print();
        System.out.println("Element present at " + l1.getElement(2));
        System.out.println("Head Element is" +head.val);
    }
}
