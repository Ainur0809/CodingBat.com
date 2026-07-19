package org.example.warmup1;

public class Max1020 {
    public static void main(String[] args) {
        Max1020 obj = new Max1020();
        System.out.println(obj.max1020(11,19));
    }
    public int max1020(int a, int b) {
        if (a>=10 && a<=20) {
            if (b>=10 && b<=20) {
                if (a>b){
                    return a;
                } return b;
            } return a;
        } if (b>=10 && b<=20) {
            return b;
        } return 0;
    }
}
