package test.advanceTest;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/3/14 17:12
 * @Modified By
 */
public class binaryAl {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 8, 10, 11, 13, 15};
        int target = 3;
        System.out.println(test(arr,target));
    }



    private static int test(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (arr[mid]==target) {
                return mid;
            }
            if (arr[mid]>target) {
                end = mid -1;
            }
            if (arr[mid]<target) {
                start = mid+1;
            }
        }
        return -1;
    }

}
