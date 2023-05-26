package Thread.ThreadTest02;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/26 09:14
 * @Modified By
 */
public class ConditionExamle {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread t1 = new Thread(new IncrementThread(resource));
        Thread t2 = new Thread(new DecrementThread(resource));

        t1.start();
        t2.start();
    }
}
