package org.example.string1;

public class ExtraEnd {
    public static void main(String[] args) {
        ExtraEnd obj =  new ExtraEnd();
        System.out.println(obj.extraEnd("Hello"));
    }
    public String extraEnd(String str) {
        String word = str.substring(str.length()-2);
        return word+word+word;
    }

}
