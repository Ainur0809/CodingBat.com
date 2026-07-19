package org.example.string1;

public class WithouEnd2 {
    public static void main(String[] args) {
        WithouEnd2 obj = new WithouEnd2();
        System.out.println(obj.withouEnd2("Hello"));
    }
    public String withouEnd2(String str) {
        int length = str.length();
        if (length>2) {
            return str.substring(1,length-1);
        } return "";
    }

}
