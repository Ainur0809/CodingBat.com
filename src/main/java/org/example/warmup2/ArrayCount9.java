package org.example.warmup2;

public class ArrayCount9 {
    public static void main(String[] args) {
        ArrayCount9 obj = new ArrayCount9();
        System.out.println(obj.arrayCount9(new int[]{1, 2, 9}));
    }
    public int arrayCount9(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }

        return count;
    }

}
