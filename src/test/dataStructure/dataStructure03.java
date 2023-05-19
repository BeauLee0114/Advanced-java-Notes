package test.dataStructure;

import java.util.NoSuchElementException;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/3/20 11:41
 * @Modified By
 */
public class dataStructure03 {
    public static class LinkedStack<E> {

        private final Node<E> head = new Node<>(null);   //大体内容跟链表类似

        private static class Node<E> {
            E element;
            Node<E> next;

            public Node(E element) {
                this.element = element;
            }
        }
        //压栈
        public void push(E element){
            Node<E> node = new Node<>(element);
            node.next=head.next;
            head.next=node;
        }

        //出栈
        public E pop(){
            if (head.next==null){
                throw new NoSuchElementException("栈为空");
            }
            E e = head.next.element;
            head.next=head.next.next;
            return e;
        }
        public static void main(String[] args) {
            LinkedStack<String> stack = new LinkedStack<>();
            stack.push("AAA");
            stack.push("BBB");
            stack.push("CCC");
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }



    }
}
