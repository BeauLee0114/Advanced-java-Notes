package algorithm;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/8/30 17:16
 * @Modified By
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 10);
        }
        Shellsort(randomArray);
    }

        public static void Shellsort(int[] a){

            System.out.println("排序之前");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+"\t");
            }

            int count = 0;
            for(int gap = a.length / 2; gap>0; gap /= 2) {
                for (int i = gap; i < a.length; i++) {
                    int index = i;
                    int arr = a[index];
                    if (arr < a[index - gap]) {
                        while (index - gap >= 0 && arr < a[index - gap]) {
                            count++;
                            a[index] = a[index - gap];
                            index -= gap;
                        }
                        a[index] = arr;
                    }
                }
            }
            System.out.println("\n" + "排序之后");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + "\t");
            }
        }

}
