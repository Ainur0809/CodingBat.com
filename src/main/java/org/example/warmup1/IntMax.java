package org.example.warmup1;

public class IntMax {
    public static void main(String[] args) {
        IntMax obj = new IntMax();
        System.out.println(obj.intMax(1,2,3));
    }
    public int intMax(int a, int b, int c) {
        int max = 0;
        if (a>b) {
            max=a;
        }else {
            max=b;
        }
        if (c>max) {
            max=c;
        }
        return max;
    }
}
