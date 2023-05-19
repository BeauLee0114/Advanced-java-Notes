package algorithm;
/*查找我们想要的数在哪里，存在返回下标，不存在返回-1*/
public class binary {
    public static void main(String[] args) {
        int [] arr = new int []{1,4,5,6,7,12,14,20,22,26};
        //System.out.println(arr.length);
        System.out.println(test(arr,12));
    }


    private static int test (int[] arr,int target){
        int start = 0,end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if (arr[mid]==target) return mid;
            if (arr[mid]>target) end = mid-1;
            if (arr[mid]<target) start = mid+1;
        }
        return -1;
    }
}

