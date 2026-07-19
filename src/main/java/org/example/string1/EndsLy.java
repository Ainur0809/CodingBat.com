package org.example.string1;

public class EndsLy {
    public static void main(String[] args) {
        EndsLy obj = new EndsLy();
        System.out.println(obj.endsLy("oddly"));
    }
    public boolean endsLy(String str) {
        if (str.endsWith("ly")) {
            return true;
        } return false;
    }

}
