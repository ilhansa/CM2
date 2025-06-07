package CM2;

public class Queue {
    TransaksiLayanan[] data;
    int front;
    int rear;
    int size;
    int max;

    Queue(int n) {
        max = n;
        data = new TransaksiLayanan[max];
        front = 0;
        rear = 0;
        size = 0;
    }

    boolean isFull() {
        return size == max;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(TransaksiLayanan transaksi) {
        if (isFull()) {
            
            front = (front + 1) % max;
            size--;
        }
        data[rear] = transaksi;
        rear = (rear + 1) % max;
        size++;
    }

    void printSemua() {
        int count = size;
        int i = front;
        System.out.println("-- Riwayat Transaksi --");
        System.out.println("Daftar Transaksi: ");
        while(0 < count) {
            System.out.print((i + 1) + ". ");
            data[i].tampil();
            i = (i + 1) % max;
            count--;
        }
    }
}
