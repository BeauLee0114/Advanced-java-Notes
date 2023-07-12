package Thread.ThreadTest02;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/26 08:51
 * @Modified By
 */
class SharedResource {
    private int count = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increment() {
        lock.lock();
        try {
            while (count >= 10) {
                condition.await(); // 等待条件满足
            }
            count++;
            System.out.println("Incremented: " + count);
            condition.signalAll(); // 唤醒其他等待线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void decrement() {
        lock.lock();
        try {
            while (count <= 0) {
                condition.await(); // 等待条件满足
            }
            count--;
            System.out.println("Decremented: " + count);
            condition.signalAll(); // 唤醒其他等待线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

