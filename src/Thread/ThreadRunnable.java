package Thread;

/**
Created by IntelliJ IDEA.
@Author : 李博
@Description 第二种方法 实现Runnable  实现很多种方法 推荐使用

@create 2023/5/19 14:51
@Modified By
*/
public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from RUnnable");

        }
    }
}
