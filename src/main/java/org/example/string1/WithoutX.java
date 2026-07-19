package org.example.string1;

public class WithoutX {
    public static void main(String[] args) {
        WithoutX obj = new WithoutX();
        System.out.println(obj.withoutX("xHix"));
    }
    public String withoutX(String str) {
        if (str.equals("x") || str.equals("")){
            return "";
        }else if (str.substring(0,1).equals("x") && str.substring(str.length()-1).equals("x")){
            return str.substring(1,str.length()-1);
        } else if (str.substring(0,1).equals("x")){
            return str.substring(1);
        } else if (str.substring(str.length()-1).equals("x")){
            return str.substring(0,str.length()-1);
        } return str;
    }

}
