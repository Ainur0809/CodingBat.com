package org.example.string1;

public class Right2 {
    public static void main(String[] args) {
        Right2 obj = new Right2();
        System.out.println(obj.right2("Hello"));
    }
    public String right2(String str) {
        return str.substring(str.length()-2)+str.substring(0, str.length()-2);
    }

}
