package org.example.string1;

public class Without2 {
    public static void main(String[] args) {
        Without2 obj = new Without2();
        System.out.println(obj.without2("HelloHe"));
    }
    public String without2(String str) {
        if (str.length()==0 || str.length()==2){
            return "";
        }else if (str.length()==1){
            return str;
        } else if (str.substring(0,2).equals(str.substring(str.length()-2))){
            return str.substring(2);
        }else{
            return str;
        }
    }

}
