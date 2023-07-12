package Thread.ThreadTest05;


import Thread.ThreadTest04.CustomThreadFactory;
import Thread.ThreadTest04.ThreadPoolExample;
import Thread.CommonThreadPool;
import java.util.concurrent.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/6/8 10:46
 * @Modified By
 */
public class ConcurrentCollectionExample extends Thread {
    public static void main(String[] args) {
        String Name = "concurrentCollection";
        CustomThreadFactory factory = new CustomThreadFactory(Name);
        CommonThreadPool pool = new CommonThreadPool(10, 20, 100,factory);


        // 使用ConcurrentHashMap存储键值对
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // 添加键值对
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // 使用ConcurrentLinkedQueue存储元素
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        // 添加元素
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        // 多线程读取和修改ConcurrentHashMap
        Runnable readTask = () -> {
            for (String key : map.keySet()) {
                int value = map.get(key);
                System.out.println("Key: " + key + ", Value: " + value);
            }
        };

        Runnable writeTask = () -> {
            map.put("D", 4);
            map.remove("C");
        };
        //pool.execute(readTask);

        Thread reader1 = new Thread(readTask);
        Thread reader2 = new Thread(readTask);
        Thread writer = new Thread(writeTask);

        reader1.start();
        reader2.start();
        writer.start();

        try {
            reader1.join();
            reader2.join();
            writer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 多线程操作ConcurrentLinkedQueue
        Runnable processTask = () -> {
            while (!queue.isEmpty()) {
                String element = queue.poll();
                System.out.println("Processed: " + element);
            }
        };

        Thread processor1 = new Thread(processTask);
        Thread processor2 = new Thread(processTask);

        processor1.start();
        processor2.start();

        try {
            processor1.join();
            processor2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
