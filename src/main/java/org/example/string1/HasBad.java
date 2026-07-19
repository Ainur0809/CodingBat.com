package org.example.string1;

public class HasBad {
    public static void main(String[] args) {
        HasBad obj = new HasBad();
        System.out.println(obj.hasBad("badxx"));
    }
    public boolean hasBad(String str) {
        int l = str.length();
        if (l>0){
            if (str.substring(0).startsWith("bad")||str.substring(1).startsWith("bad")){
                return true;
            } return false;
        } return false;
    }

}
