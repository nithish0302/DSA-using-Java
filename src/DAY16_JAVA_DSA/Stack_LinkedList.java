package DAY16_JAVA_DSA;

class Node {
    int data;
    Node next;

    public Node(int val) {
        this.data = val;
        this.next = null;
    }
}

class MStack {
    Node head;
    int size;

    public MStack() {
        this.head = null;
        this.size = 0;
    }

    public void push(int data) {
        Node n1 = new Node(data);
        if (head == null) {
            head = n1;
            size++;
        } else {
            n1.next = head;
            head = n1;
            size++;
        }
        System.out.println("Value inserted");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Cant pop the element Stack is empty");
            return -1;
        }
        int top = head.data;

        head = head.next;
        size--;
        return top;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else
            return false;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }
}

public class Stack_LinkedList {
    public static void main(String[] args) {
        MStack s1 = new MStack();
        s1.push(15);
        s1.push(25);
        s1.push(35);
        s1.push(45);
        s1.push(55);
        System.out.println(s1.peek());
        System.out.println("Value poped" + s1.pop());
        System.out.println(s1.peek());
    }

}
