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

// Another way of doing multi threading without extending thread
class AnotherWayofUsingMultithreading implements Runnable {

    public void eat() {
        System.out.println("I am eating");
    }

    @Override
    public void run() {
        System.out.println("God is Good!");
    }

}