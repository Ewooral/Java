public class Multithreading {

    public static void main(String[] args) {

        // five threads at a time
        for (int i = 0; i <= 5; i++) {
            MultithreadThing newThread = new MultithreadThing(i);
            newThread.start();
        }

        AnotherWayofUsingMultithreading anotherWayOfThreading = new AnotherWayofUsingMultithreading();
        Thread myThread = new Thread(anotherWayOfThreading);
        myThread.start();

    }
}

class AnotherWayofUsingMultithreading implements Runnable {

    @Override
    public void run() {
        System.out.println("God is Good!");
    }

}