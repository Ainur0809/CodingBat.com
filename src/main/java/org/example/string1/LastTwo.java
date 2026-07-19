package org.example.string1;

public class LastTwo {
    public static void main(String[] args) {
        LastTwo obj = new LastTwo();
        System.out.println(obj.lastTwo("coding"));
    }
    public String lastTwo(String str) {
        if (str.length()==0){
            return "";
        }else if (str.length()==1){
            return str;
        } else {
            String l1 = str.substring(str.length()-2, str.length()-1);
            String l2 = str.substring(str.length()-1);
            return str.substring(0,str.length()-2)+l2+l1;
        }
    }
}
