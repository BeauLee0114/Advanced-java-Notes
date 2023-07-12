package Thread.ThreadTest01;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/22 09:24
 * @Modified By
 */
public class SignalingThread implements Runnable{
    private SharedObject sharedObject;

    public SignalingThread(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }
    @Override
    public void run() {
        // 模拟耗时操作
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sharedObject.sendSignal();
    }
}
