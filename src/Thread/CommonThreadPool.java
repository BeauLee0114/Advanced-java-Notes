package Thread;

import Thread.ThreadTest04.CustomThreadFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/6/8 15:15
 * @Modified By
 */
public class CommonThreadPool {
    private ThreadPoolExecutor threadPool;

    public CommonThreadPool(int corePoolSize, int maxPoolSize, long keepAliveTime, CustomThreadFactory threadFactory) {
        threadPool = new ThreadPoolExecutor(corePoolSize,maxPoolSize,keepAliveTime, TimeUnit.MILLISECONDS,new ArrayBlockingQueue<>(100),threadFactory);
    }

    public void execute(Runnable task){
        threadPool.execute(task);
    }

    public void shutdown(){
        threadPool.shutdown();
    }
}
