package org.example.warmup1;

public class FrontBack {
    public static void main(String[] args) {
        FrontBack obj1 = new FrontBack();
        System.out.println(obj1.frontBack("code"));
    }
    public String frontBack(String str) {
        if (str.length()<2){
            return str;
        }return str.substring(str.length()-1)+str.substring(1, str.length()-1)+str.substring(0,1);
    }
}
