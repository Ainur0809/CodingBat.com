package org.example.string1;

public class TheEnd {
    public static void main(String[] args) {
        TheEnd obj = new TheEnd();
        System.out.println(obj.theEnd("Hello", true));
    }
    public String theEnd(String str, boolean front) {
        if (front){
            return str.substring(0,1);
        } return str.substring(str.length()-1);
    }

}
