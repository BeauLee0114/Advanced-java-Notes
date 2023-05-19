package JUC;

import java.util.Arrays;

public class JUC01 {
        public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 5, 2, 4};
        //请将上面的数组按升序输出
            for (int i:arr) {
                new Thread(()->{
                    try {
                        Thread.sleep(1000);
                        System.out.println(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).start();
            }
    }
}
