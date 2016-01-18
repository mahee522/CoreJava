package com;

public class DaemonThread {
	public static void main(String[] args) {
		WorkerThread workerThread = new WorkerThread();
		workerThread.setDaemon(true);
		// When false, (i.e. when it's a user thread),
        // the Worker thread continues to run.
        // When true, (i.e. when it's a daemon thread),
        // the Worker thread terminates when the main 
        // thread terminates.
		workerThread.start();
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {}
        System.out.println("Main Thread ending") ;
    }

}
class WorkerThread extends Thread {
//    public WorkerThread() {
//        setDaemon(true) ; }  

    public void run() {
        int count=0 ;
        while (true) {
            System.out.println("Hello from Worker "+count++) ;
            try {
                sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}