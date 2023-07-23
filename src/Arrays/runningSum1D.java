//https://leetcode.com/problems/running-sum-of-1d-array/
package Arrays;

import java.util.Arrays;

public class runningSum1D {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4,6,9,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++)
            nums[i]=nums[i]+nums[i-1]; //prefix sum calculation
        return nums;

    }
}
