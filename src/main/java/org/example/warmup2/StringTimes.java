package org.example.warmup2;

public class StringTimes {
    public static void main(String[] args) {
        StringTimes obj = new StringTimes();
        System.out.println(obj.stringTimes("Hi", 2));
    }
    public String stringTimes(String str, int n) {
        int i = 1;
        String t = "";
        while (i<=n){
            t += str;
            i++;
        }
        return t;
    }
}
