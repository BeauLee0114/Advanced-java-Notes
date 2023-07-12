package Thread.ThreadTest01;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/22 09:14
 * @Modified By
 */
public class SharedObject {
    private boolean isReady = false;

    public synchronized void waitForSingal(){
        while (!isReady){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("收到讯号");
    }
    public synchronized void sendSignal() {
        this.isReady = true;
        notify(); // 唤醒一个等待的线程
    }
}
