package org.example.array1;

public class FirstLast6 {
    public static void main(String[] args) {
        FirstLast6 obj = new FirstLast6();
        System.out.println(obj.firstLast6(new int[]{1,2,6}));
    }
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
}
