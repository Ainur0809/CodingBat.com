package org.example.warmup1;

public class NotString {
    public static void main(String[] args) {
        NotString obj = new NotString();
        System.out.println(obj.notString("candy"));
    }
    public String notString(String str) {
        if (str.length()>=3) {
            if (str.substring(0,3).equals("not")) {
                return str;
            } else {
                return "not "+str;
            }
        } return "not "+str;
    }
}
