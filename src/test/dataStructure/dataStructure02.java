package test.dataStructure;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/3/17 15:41
 * @Modified By
 */
public class dataStructure02 {
    public static class LinkedList<E> {
        //链表的头结点，用于连接之后的所有结点
        private final Node<E> head = new Node<>(null);
        private int size = 0;   //当前的元素数量还是要存一下，方便后面操作

        private static class Node<E> {  //结点类，仅供内部使用
            E element;   //每个结点都存放元素   当前元素
            Node<E> next;   //以及指向下一个结点的引用 下一个节点的元素

            public Node(E element) {
                this.element = element;
            }
        }


        public void add(E element,int index){
            //校验合法
            if (index<0||index>size){
                throw new IndexOutOfBoundsException("插入位置非法，合法插入位置为0~"+size);
            }
            Node<E> prev = head;
            for (int i = 0; i <index; i++) {
                prev = prev.next;
            }
            Node<E> node = new Node<>(element);
            //新插入的结点指向在这个节点
            node.next=prev.next;
            //前驱节点的后继节点指向修改为我们新插入的结点
            prev.next=node;
            size++;
        }

        //删除
        public E remove(int index){
            if (index<0||index>size-1){
                throw new IndexOutOfBoundsException("删除位置非法，合法删除位置为：0~"+(size-1));
            }
            Node<E> prev = head;
            for (int i = 0; i <index; i++) {
                prev = prev.next;
            }
            E e = prev.next.element;
            prev.next = prev.next.next;
            size--;
            return e;
        }

        //获取
        public E get(int index){
            if(index < 0 || index > size - 1) {
                throw new IndexOutOfBoundsException("非法的位置，合法的位置为：0 ~ "+(size - 1));
            }
            Node<E> node = head;
            while (index-- >= 0)   //这里直接让index减到-1为止
            {
                node = node.next;
            }
            return node.element;
        }

        public int size(){
            return size;
        }



        @Override
        public String toString(){
            StringBuilder stringBuilder = new StringBuilder();
            Node<E> node = head.next;
            while(node!=null){
                stringBuilder.append(node.element).append(" ");
                node = node.next;
            }
            return stringBuilder.toString();
        }

        public static void main(String[] args) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            linkedList.add(10,0);
            linkedList.add(30,0);
            linkedList.add(20,1);

            System.out.println(linkedList);
        }





    }




    
}
