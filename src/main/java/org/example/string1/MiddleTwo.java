package org.example.string1;

public class MiddleTwo {
    public static void main(String[] args) {
        MiddleTwo obj = new MiddleTwo();
        System.out.println(obj.middleTwo("string"));
    }
    public String middleTwo(String str) {
        int l = str.length();
        return str.substring(l/2-1, l/2+1);
    }

}
