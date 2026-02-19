package RunnablevsThread;

public class MyThread extends Thread{

    public MyThread(String name) {//Assiging name to my thread
        super(name);
    }
    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName()+"-Priority: "+Thread.currentThread().getPriority()+" count "+i);
//            try
//            {
//                Thread.sleep(100);
//            }catch (Exception e){
//
//            }
        try{
            Thread.sleep(1000);
            System.out.println("Thread is running...");
        }catch (InterruptedException e){
            System.out.println("Thread interrupted"+e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        MyThread t1=new MyThread("Low Priority Thread");
//        MyThread t2=new MyThread("Normal Priority Thread");
//        MyThread t3=new MyThread("Max Priority Thread");
//      // t.start();
//       t3.setPriority(Thread.MAX_PRIORITY);
//       t1.setPriority(Thread.MIN_PRIORITY);
//       t2.setPriority(Thread.MAX_PRIORITY);
//       t1.start();
//       t2.start();
//       t3.start();
//        t1.join();
//        System.out.println("Hello World");

        MyThread t1=new MyThread("t1");
        t1.start();
        t1.interrupt();
    }
}
