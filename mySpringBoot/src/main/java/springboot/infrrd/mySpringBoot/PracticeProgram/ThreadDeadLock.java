package springboot.infrrd.mySpringBoot.PracticeProgram;

public class ThreadDeadLock {
}



 class TestDeadlockExample1 {
    public static void main(String[] args) {
        final String resource1 = "ratan jaiswal";
        final String resource2 = "vimal jaiswal";
        // t1 tries to lock resource1 then resource2
        Thread t1 = new Thread() {
            public void run()  {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");
                    try {
                        resource2.wait();

                        Thread.sleep(1);} catch (Exception e) {}

                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };


        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");

                    try {
                        resource2.notify();
                        Thread.sleep(100);}catch (Exception e) {}

                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };


        t1.start();

        t2.start();


    }
}