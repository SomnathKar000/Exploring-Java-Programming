package Concepts;

public class Threads {
    public static void main(String args[]) {
        A obj1 = new A();
        B obj2 = new B();

        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();

    }
}

class A extends Thread {
    public void run() {
        try {
            show();
            System.out.println(getName());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void show() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            Thread.sleep(1000);
        }
    }
}

class B extends Thread {
    public void run() {
        try {
            show();
            System.out.println(getName());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void show() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            Thread.sleep(1000);
        }
    }
}