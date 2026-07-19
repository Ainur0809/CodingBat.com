package org.example.string1;

public class NonStart {
    public static void main(String[] args) {
        NonStart obj =  new NonStart();
        System.out.println(obj.nonStart("Hello", "There"));
    }
    public String nonStart(String a, String b) {
        return a.substring(1)+b.substring(1);
    }

}
