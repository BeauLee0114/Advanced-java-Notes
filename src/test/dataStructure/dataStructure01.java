package test.dataStructure;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/3/17 11:32
 * @Modified By
 */
public class dataStructure01 {

    public static class ArrayList<E> {//泛型E，因为表中要存的具体数据类型待定
        int capacity = 10; //当前顺序表的容量
        int size = 0;//当前已经存放的元素数量
        private Object[] array = new Object[capacity];//底层存放数据的数组


        //添加
        public void add(E element, int index) {   //插入方法需要支持在指定下标位置插入
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("插入位置非法，合法的插入位置：0~" + (size - 1));
            }
            if (capacity == size) {
                int newCapacity = capacity + (capacity >> 1);
                Object[] newArray = new Object[newCapacity];
                System.arraycopy(array, 0, newArray, 0, size);
                array = newArray;
                capacity = newCapacity;
            }
            for (int i = size; i > index; i--)   //从后往前，一个一个搬运元素
            {
                array[i] = array[i - 1];
            }
            array[index] = element;   //腾出位置之后，直接插入元素放到对应位置上
            size++;   //插入完成之后，记得将size自增
        }


        //删除
        @SuppressWarnings("unchecked")
        public E remove(int index) {//删除对应位置的元素 注意需要返回删除的元素
            if (index < 0 || index > size - 1) {
                throw new IndexOutOfBoundsException("删除位置非法，合法的插入位置：0~" + (size - 1));
            }
            E e = (E) array[index];//存放的object类型，强行传换成e
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
            return e;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < size; i++) {
                builder.append(array[i]).append(" ");
            }
            return builder.toString();
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //arrayList.add(10,1);
        for (int i = 0; i < 20; i++) {
            arrayList.add(i, i);
            System.out.println(arrayList);
        }


    }


}
