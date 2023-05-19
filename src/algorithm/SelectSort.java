package algorithm;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/8/30 11:34
 * @Modified By 插入排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 10);
        }
        SelectSort(randomArray);
    }

        public static void SelectSort(int []arr){
            System.out.println("排序之前");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+"\t");
            }
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = i; j < arr.length-1; j++) {
                    if (arr[j+1] < arr[i]) {
                        //交换两数
                        swag(arr,i,j+1);
                    }
                }
            }
            System.out.println("\n"+"排序后：");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+"\t");
            }
            
            
        }
            public static void swag(int[] a,int i, int j){
                    int k =0;
                    k=a[i];
                    a[i]=a[j];
                    a[j]=k;
            }





}
