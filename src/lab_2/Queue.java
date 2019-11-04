package lab_2;


public class Queue {
    Node front, last;
    int size;
    int maxSize;

    public Queue(int size) {
        this.maxSize = size;
        this.front = this.last = null;
        this.size = 0;
    }

    public Queue() {
        this.front = this.last = null;
        this.maxSize = -1;
    }

    public boolean isFull() {
        if (this.maxSize >= 0) {
            return size == maxSize;
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(double data) {
        if (this.isFull())
            throw new RuntimeException("Queue already full");

        Node temp = new Node(data);
        if (this.last == null) {
            this.front = this.last = temp;
        } else {
            this.last.next = temp;
            this.last = temp;
        }
        this.size++;
    }

    public void pop() {
        if (this.isEmpty()) {
            throw new RuntimeException("Queue is already empty");
        }

        if (front.next == null)
            last = null;

        front = front.next;
        this.size--;
    }

    public void showQueue() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
