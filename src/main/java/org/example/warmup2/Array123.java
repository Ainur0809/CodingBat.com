package org.example.warmup2;

public class Array123 {
    public static void main(String[] args) {
        Array123 obj = new Array123();
        System.out.println(obj.array123(new  int[]{1, 1, 2, 3, 1}));
    }
    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

}
