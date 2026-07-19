package org.example.string1;

public class WithoutX2 {
    public static void main(String[] args) {
        WithoutX2 obj = new WithoutX2();
        System.out.println(obj.withoutX2("xHi"));
    }
    public String withoutX2(String str) {
        if (str.equals("x") || str.equals("")){
            return "";
        } else if (str.substring(0,2).equals("xx")) {
            return str.substring(2);
        } else if (str.substring(0,1).equals("x")){
            return str.substring(1);
        } else if (str.substring(1,2).equals("x")){
            return str.substring(0,1)+str.substring(2);
        } return str;
    }

}
