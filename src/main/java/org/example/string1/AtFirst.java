package org.example.string1;

public class AtFirst {
    public static void main(String[] args) {
        AtFirst obj = new AtFirst();
        System.out.println(obj.atFirst("hello"));
    }
    public String atFirst(String str) {
        int l = str.length();
        if (l>=2){
            return str.substring(0,2);
        } else if (l==1) {
            return str+"@";
        } return "@@";
    }
}
