package DAY14_JAVA_DSA;

public class Stack {
    private int arr[];
    private int idx;
    private int maxsize;

    public Stack(int size) {
        this.maxsize = size;
        this.arr = new int[maxsize];
        this.idx = -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("The element cant be push");
            return;
        }
        idx++;
        arr[idx] = data;
        System.out.println("Element pushed");

    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("The element cant be pop");
            return -1;
        }

        int top = arr[idx];
        idx--;
        return top;

    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The element cant be pop");
            return -1;
        }
        return arr[idx];
    }

    public boolean isEmpty() {
        if (idx == -1)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (idx == maxsize - 1) {
            return true;
        } else
            return false;
    }

    public int size() {
        return idx + 1;
    }

    public int capacity() {
        return maxsize;
    }

    public static void main(String[] args) {
        Stack s1 = new Stack(8);

        s1.push(10);
        System.out.println((s1.isFull() == false) ? "Not Full" : "It is Full");
        
        s1.push(20);
        System.out.println((s1.isFull() == false) ? "Not Full" : "It is Full");
        
        s1.push(30);
        System.out.println((s1.isFull() == false) ? "Not Full" : "It is Full");
        
        s1.push(40);
        System.out.println((s1.isFull() == false) ? "Not Full" : "It is Full");
        
        s1.push(50);
        System.out.println((s1.isFull() == false) ? "Not Full" : "It is Full");
        
        s1.push(60);
        s1.push(70);
        System.out.println((s1.isFull() == false) ? "Not Full" : "It is Full");
        
        System.out.println(s1.pop());
        
}
}
    

