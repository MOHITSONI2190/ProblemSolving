package com.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSum(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        for (int i = 0; i < nums.length; i++) {
            int a_pointer = i + 1;
            int b_pointer = nums.length - 1;

            while (a_pointer < b_pointer) {
                int sum = nums[i] + nums[a_pointer] + nums[b_pointer];
                if (sum > target) {
                    b_pointer--;
                } else {
                    a_pointer++;
                }

                if (Math.abs(target - sum) == 0) {
                    return sum;
                }



                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }

        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {-3,-2,-5,3,-4};
        System.out.print(ThreeSumClosest.threeSum(nums,-1));
    }
}