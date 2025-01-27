package Concepts;

public class Threads {
    public static void main(String args[]) {
        Runnable obj1 = () -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hi");
                    Thread.sleep(1000);
                }

            } catch (Exception e) {
                System.out.println(e.toString());
            }

        };
        Runnable obj2 = () -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello");
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}

class A implements Runnable {
    public void run() {
        try {
            show();
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

class B implements Runnable {
    public void run() {
        try {
            show();
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