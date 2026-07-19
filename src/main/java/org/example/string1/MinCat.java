package org.example.string1;

public class MinCat {
    public static void main(String[] args) {
        MinCat obj = new MinCat();
        System.out.println(obj.minCat("Hello", "Hi"));
    }
    public String minCat(String a, String b) {
        int d = 0;
        if (a.length()>b.length()){
            d = a.length()-b.length();
            return  a.substring(d)+b;
        } else if (b.length()>a.length()){
            d = b.length()-a.length();
            return a+b.substring(d);
        } else {
            return a+b;
        }
    }


}
