package Concepts;

public class Threads {
    public static void main(String args[]) {
        Counter count = new Counter();
        Runnable obj1 = () -> {
            for (int i = 0; i < 10000; i++) {
                count.increment();
            }

        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 10000; i++) {
                count.increment();
            }

        };

        try {
            Thread t1 = new Thread(obj1);
            Thread t2 = new Thread(obj2);

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            System.out.println(count.num);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}

class Counter {
    int num;

    public synchronized void increment() {
        num++;
    }
}