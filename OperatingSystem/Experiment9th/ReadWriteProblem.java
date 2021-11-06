package Experiment9th;

import java.util.concurrent.Semaphore;

class ReadWriteProblem {
    static Semaphore read = new Semaphore(1);
    static Semaphore write = new Semaphore(1);
    static int count = 0;

    public static class Read extends Thread {
        Semaphore sem;
        String threadName;

        public Read(Semaphore sem, String threadName) {
            super(threadName);
            this.sem = sem;
            this.threadName = threadName;
        }

        @Override
        public void run() {
            try {
                System.out.println(threadName + " waiting ...");
                read.acquire();
                count++;
                System.out.println(threadName + " entired ...");

                if (count == 1) {
                    write.acquire();
                }
                read.release();

                System.out.println("Thread " + threadName + " is READING");
                Thread.sleep(600);
                System.out.println("Thread " + threadName + " has FINISHED READING");

                read.acquire();
                count--;
                if (count == 0) {
                    write.release();
                }
                read.release();

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
    }

public static class Write extends Thread {
        Semaphore sem;
        String threadName;

        public Write(Semaphore sem, String threadName) {
            super(threadName);
            this.sem = sem;
            this.threadName = threadName;
        }

        @Override
        public void run() {
            try {
                System.out.println(threadName + " waiting ...");
                write.acquire();
                System.out.println(threadName + " entired ...");
                count++;
                System.out.println("Thread " + threadName + " is WRITING");
                Thread.sleep(600);
                System.out.println("Thread " + threadName + " has FINISHED WRITING");
                write.release();

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
    }


    public static void main(String[] args) throws InterruptedException {
        Semaphore sem = new Semaphore(1);
        
        Read r1 = new Read(sem,"R1");
        Read r2 = new Read(sem,"R2");
        Write w1 = new Write(sem,"W1");
        Write w2 = new Write(sem, "W2");

        r1.start();
        w1.start();
        r2.start();
        w2.start(); 
        

    }
}