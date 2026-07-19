package org.example.warmup1;

public class NearHundred {
    public static void main(String[] args) {
        NearHundred obj = new NearHundred();
        System.out.println(obj.nearHundred(93));
    }
    public boolean nearHundred(int n) {
        if (Math.abs(100-n)<=10 || Math.abs(200-n)<=10) {
            return true;
        }
        return false;
    }
}
