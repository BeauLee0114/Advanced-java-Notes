package leetcode.DataStructure;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
 * @create 2023/1/18 15:06
 * @Modified By
 */
public class repeat01 {
    public boolean main(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int x:nums){
                if (!set.add(x)){
                    return true;
                }
        }
        return false;
    }
}
