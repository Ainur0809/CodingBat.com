package org.example.warmup1;

public class Close10 {
    public static void main(String[] args) {
        Close10 obj = new Close10();
        System.out.println(obj.close10(8,13));
    }
    public int close10(int a, int b) {
        if (Math.abs(10 - a) == Math.abs(10-b)){
            return 0;
        } else if (Math.abs(10 - a) > Math.abs(10-b)){
            return b;
        } return a;
    }
}
