package org.example.string1;

public class ComboString {
    public static void main(String[] args) {
        ComboString obj =  new ComboString();
        System.out.println(obj.comboString("Hello", "Hi"));
    }
    public String comboString(String a, String b) {
        if (a.length()>b.length()) {
            return b+a+b;
        } return a+b+a;
    }

}
