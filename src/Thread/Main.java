package Thread;

public class Main {
    public static void main(String[] args) {
        //第一种方法的使用
        Thread01 thread01 = new Thread01();
        thread01.start();

        //第二种方法的使用
        ThreadRunnable threadRunnable = new ThreadRunnable();
        Thread thread = new Thread(threadRunnable);
        thread.setName("Runnable");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        //synchronized (thread){
        //    thread.wait();
        //}
        System.out.println("线程名："+thread.getName()+"线程优先级:"+thread.getPriority());


    }
}
