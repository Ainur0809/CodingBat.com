package org.example.warmup1;

public class MixStart {
    public static void main(String[] args) {
        MixStart  obj = new MixStart();
        System.out.println(obj.mixStart("mix snacks"));
    }
    public boolean mixStart(String str) {
        if (str.length()>2 && str.substring(1,3).equals("ix")){
            return true;
        } return false;
    }
}
