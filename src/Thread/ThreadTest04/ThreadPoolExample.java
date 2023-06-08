package Thread.ThreadTest04;

import java.util.concurrent.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/26 16:02
 * @Modified By
 */
public class ThreadPoolExample {

    public static void main(String[] args) {
        int corePoolSize = 10;
        // 核心线程数
        int maximumPoolSize = 10;
        // 最大线程数
        long keepAliveTime = 60;
        // 线程空闲时间
        TimeUnit unit = TimeUnit.SECONDS;
        // 时间单位
        String threadNamePrefix = "线程名";
        ThreadFactory threadFactory = new CustomThreadFactory(threadNamePrefix);
        //线程工厂
        ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, new ArrayBlockingQueue<>(100), threadFactory);

        //创建一个固定大小的线程池
        ExecutorService executor1 = Executors.newFixedThreadPool(5);
        // 提交任务给线程池
        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            Runnable task = () -> {
                System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + taskId + " 已结束");
            };

            executor.execute(task);
            //    executor1.execute(() -> {
            //        System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
            //        try {
            //            Thread.sleep(1000);
            //        } catch (InterruptedException e) {
            //            e.printStackTrace();
            //        }
            //        System.out.println("Task " + taskId + " has finished");
            //    });
            //}


        }
        executor.shutdown();
    }
}
