public class Multithreading {

    public static void main(String[] args) {

        // five threads at a time
        for (int i = 0; i <= 1; i++) {
            MultithreadThing newThread = new MultithreadThing(i);
            newThread.start();
        }

        AnotherWayofUsingMultithreading anotherWayOfThreading = new AnotherWayofUsingMultithreading();
        Thread myThread = new Thread(anotherWayOfThreading);
        anotherWayOfThreading.eat();
        myThread.start();

    }
}

// Multi threading using the Runnable interface
class AnotherWayofUsingMultithreading implements Runnable {

    public void eat() {
        System.out.println("I am eating");
    }

    @Override
    public void run() {
        System.out.println("God is Good!");
    }

}

// Multithreading using Thread class
class MultithreadThing extends Thread {

    private int thread;

    public MultithreadThing(int num) {
        this.thread = num;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + this.thread);
            if (this.thread == 3) {
                throw new RuntimeException();
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

    }

}
