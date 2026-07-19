package org.example.warmup2;

public class Has271 {
    public static void main(String[] args) {
        Has271 obj = new Has271();
        System.out.println(obj.has271(new int[]{1,2,7,1}));
    }
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int val = nums[i];
            if (nums[i + 1] == val + 5) {
                int expected = val - 1;
                int actual = nums[i + 2];
                if (actual - expected >= -2 && actual - expected <= 2) {
                    return true;
                }
            }
        }

        return false;
    }

}
