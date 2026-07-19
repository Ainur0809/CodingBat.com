package org.example.warmup1;

public class SumDouble {
    public static void main(String[] args) {
        SumDouble obj = new SumDouble();
        System.out.println(obj.sumDouble(1,2));
    }
    public int sumDouble(int a, int b) {
        if (a==b) {
            return (a+b)*2;
        }
        return a+b;
    }
}
