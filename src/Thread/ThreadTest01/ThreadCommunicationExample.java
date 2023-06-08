package Thread.ThreadTest01;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description 如何使用wait()和notify()方法实现线程之间的通信。
 * @create 2023/5/22 09:28
 * @Modified By
 */
public class ThreadCommunicationExample {
    public static void main(String[] args) {
        SharedObject sharedObject = new SharedObject();
        Thread waitingThread  = new Thread(new WaitingThread(sharedObject));
        Thread signalingThread = new Thread(new SignalingThread(sharedObject));

        waitingThread.start();
        signalingThread.start();

    }
}
