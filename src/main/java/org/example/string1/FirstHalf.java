package org.example.string1;

public class FirstHalf {
    public static void main(String[] args) {
        FirstHalf obj =  new FirstHalf();
        System.out.println(obj.firstHalf("WooHoo"));
    }
    public String firstHalf(String str) {
        return str.substring(0,str.length()/2);
    }

}
