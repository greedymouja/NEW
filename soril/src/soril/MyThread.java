package soril;

public class MyThread extends Thread {
    private String threadName;
    private int threadPriority;

    public MyThread(String name, int priority) {
        this.threadName = name;
        this.threadPriority = priority;
    }

    public void run() {
        System.out.println("Running " + threadName);
        System.out.println("Priority: " + threadPriority);
    }

    public static void main(String args[]) {
        MyThread thread1 = new MyThread("Thread 1", Thread.MAX_PRIORITY);
        MyThread thread2 = new MyThread("Thread 2", Thread.NORM_PRIORITY);
        MyThread thread3 = new MyThread("Thread 3", Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Thread 1 is alive: " + thread1.isAlive());
        System.out.println("Thread 2 is alive: " + thread2.isAlive());
        System.out.println("Thread 3 is alive: " + thread3.isAlive());
        System.out.println("Total threads: " + Thread.activeCount());
    }
}
