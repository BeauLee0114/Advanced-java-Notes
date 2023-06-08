package Thread.ThreadTest01;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/22 09:19
 * @Modified By
 */
public class WaitingThread implements Runnable{
    private SharedObject sharedObject;

    public WaitingThread(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }
    @Override
    public void run() {
        sharedObject.waitForSingal();
    }
}
