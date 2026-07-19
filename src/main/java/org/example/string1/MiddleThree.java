package org.example.string1;

public class MiddleThree {
    public static void main(String[] args) {
        MiddleThree obj = new MiddleThree();
        System.out.println(obj.middleThree("Candy"));
    }
    public String middleThree(String str) {
        int l = str.length();
        if (l>3){
            return str.substring(l/2-1, l/2+2);
        } return str;
    }
}
