package Thread.ThreadTest04;

import java.util.concurrent.ThreadFactory;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/6/8 14:01
 * @Modified By
 */
public class CustomThreadFactory implements ThreadFactory {
    private final String threadNamePrefix;
    public CustomThreadFactory(String threadNamePrefix) {
        this.threadNamePrefix = threadNamePrefix;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setName(threadNamePrefix+"-id："+t.getId());
        return t;
    }
}
