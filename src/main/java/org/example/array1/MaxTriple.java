package org.example.array1;

public class MaxTriple {
    public int maxTriple(int[] nums) {
        int max = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];
        if (middle > max) {
            max = middle;
        }
        if (last > max) {
            max = last;
        }
        return max;
    }

}
