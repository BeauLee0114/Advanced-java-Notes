package Thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
/**
 * @author admin
 * @Describe 第一种方法 继承Thread方法
 */

public class Thread01 extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from Tread");
    }
}

