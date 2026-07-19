package org.example.warmup1;

public class StartHi {
    public static void main(String[] args) {
        StartHi obj = new StartHi();
        System.out.println(obj.startHi("hi there"));
    }
    public boolean startHi(String str) {
        if (str.length()>1 && str.substring(0,2).equals("hi")){
            return true;
        } return false;
    }
}
