package org.example.string1;

public class NTwice {
    public static void main(String[] args) {
        NTwice obj = new NTwice();
        System.out.println(obj.nTwice("Hello",2));
    }
    public String nTwice(String str, int n) {
        return str.substring(0, n)+str.substring(str.length()-n);
    }
}
