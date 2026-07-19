package org.example.warmup1;

public class Diff21 {
    public static void main(String[] args) {
        Diff21 obj = new Diff21();
        System.out.println(obj.diff21(19));
    }
    public int diff21(int n) {
        if (n>21) {
            return 2*(n-21);
        }
        return (21-n);
    }
}
