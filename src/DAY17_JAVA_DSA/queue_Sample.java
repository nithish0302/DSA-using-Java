package DAY17_JAVA_DSA;

public class queue_Sample {
    int[] queue;
    int front;
    int rear;
    int capacity;
    int size;

    public queue_Sample(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
         front = 0;
         rear = -1;
        size = 0;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Element cannot enqueue");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("There is no element ");
            return -1;
        }
        int data = queue[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else
            return false;
    }

    public boolean isFull() {
        if (capacity == size)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        queue_Sample qt = new queue_Sample(10);
        qt.enqueue(5);
        qt.enqueue(15);
        qt.enqueue(25);
        qt.enqueue(35);
        qt.enqueue(45);
        qt.enqueue(55);
        System.out.println(qt.dequeue());


    }
}
