package org.example.string1;

public class TwoChar {
    public static void main(String[] args) {
        TwoChar obj = new TwoChar();
        System.out.println(obj.twoChar("java",0));
    }
    public String twoChar(String str, int index) {
        int l = str.length();
        if (index<l-1 && index>0){
            return str.substring(index,index+2);
        } return str.substring(0,2);
    }
}
