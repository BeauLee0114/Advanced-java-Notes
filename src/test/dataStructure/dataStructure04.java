package test.dataStructure;

import java.util.NoSuchElementException;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/3/20 14:36
 * @Modified By
 */
public class dataStructure04 {

    public class LinkedQueue<E>{
        private final Node<E> head = new Node<>(null);

        public void offer(E element){
            Node<E> last = head;
            while(last.next!=null){
                last = last.next;
            }
            last.next = new Node<>(element);
        }


        public E poll(){
            if (head.next == null){
                throw new NoSuchElementException("队列为空");
            }
            E e = head.next.element;
            head.next = head.next.next;
            return e;
        }

        private static class Node<E>{
            E element;
            Node<E> next;

            public Node(E element){
                this.element = element;
            }
        }

    }

}
