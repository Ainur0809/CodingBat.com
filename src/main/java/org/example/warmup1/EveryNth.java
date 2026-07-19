package org.example.warmup1;

public class EveryNth {
    public static void main(String[] args) {
        EveryNth obj = new EveryNth();
        System.out.println(obj.everyNth("Miracle", 2));
    }
    public String everyNth(String str, int n) {
        String result = "";

        for (int i=0; i<str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }
}
