package org.example.string1;

public class Left2 {
    public static void main(String[] args) {
        Left2 obj =  new Left2();
        System.out.println(obj.left2("Hello"));
    }
    public String left2(String str) {
        return str.substring(2)+str.substring(0,2);
    }

}
