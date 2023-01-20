public class MultithreadThing extends Thread {

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
