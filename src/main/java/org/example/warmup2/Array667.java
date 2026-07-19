package org.example.warmup2;

public class Array667 {
    public static void main(String[] args) {
        Array667 obj = new Array667();
        System.out.println(obj.array667(new int[]{6,6,2}));
    }
    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6) {
                if (nums[i + 1] == 6 || nums[i + 1] == 7) {
                    count++;
                }
            }
        }

        return count;
    }

}
