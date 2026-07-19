package org.example.warmup2;

public class ArrayFront9 {
    public static void main(String[] args) {
        ArrayFront9 obj = new ArrayFront9();
        System.out.println(obj.arrayFront9(new int[]{1, 2, 9, 3, 4}));

    }
    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length && i < 4; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

}
