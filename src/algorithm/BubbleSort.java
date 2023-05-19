package algorithm;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description 冒泡排序java代码
 * @create 2022/8/29 17:16
 * @Modified By
 */
public class BubbleSort {
    public static void main(String[] args) {
//        生成10个随机数
        int [] randomArray = new int[10];
        for (int i = 0; i <randomArray.length ; i++) {
            randomArray[i] = (int) (Math.random()*10);
        }
        bubbleSortMethod(randomArray);
    }

    public static void bubbleSortMethod(int [] arr){
        System.out.println("排序之前");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
//交换
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if (arr[j] > arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }



        System.out.println("\n"+"排序之后");
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }



}
