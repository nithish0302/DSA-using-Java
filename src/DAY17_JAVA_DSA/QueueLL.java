package DAY17_JAVA_DSA;

/**
 * QueueLL
 */
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueLL {
    Node front;
    Node rear;
    int size;

    public QueueLL() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(int data) {
        Node n1 = new Node(data);
        if (isEmpty()) {
            front = n1;
            rear = n1;
            size++;
        } else {
            rear.next = n1;
            rear = n1;
            size++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Cannot dequeue");
            return -1;
        }
        int data = front.data;
        front = front.next;
        size--;
        return data;

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
        return front.data;
    }

    public void print() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        QueueLL qu = new QueueLL();
        qu.enqueue(5);
        qu.enqueue(10);
        qu.enqueue(15);
        qu.dequeue();
        qu.print();
    }

}