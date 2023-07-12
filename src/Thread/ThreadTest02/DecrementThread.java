package Thread.ThreadTest02;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/26 09:13
 * @Modified By
 */
public class DecrementThread implements Runnable{
    private SharedResource resource;

    public DecrementThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            resource.decrement();
        }
    }
}
