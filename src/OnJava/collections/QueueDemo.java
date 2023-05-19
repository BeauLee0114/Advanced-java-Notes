package OnJava.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/1/9 11:33
 * @Modified By
 */
public class QueueDemo {
    public static void printQ(Queue queue){
        while(queue.peek()!=null){
            System.out.println(queue.remove()+"");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random(47);
        for (int i = 0; i <10; i++) {
            printQ(queue);
        }
        Queue<Character>qc = new LinkedList<>();
        for (char c: "Brontosaurus".toCharArray()){
            qc.offer(c);
            printQ(qc);
        }
    }
}
