package org.example.warmup2;

public class StringSplosion {
    public static void main(String[] args) {
        StringSplosion obj = new StringSplosion();
        System.out.println(obj.stringSplosion("Code"));
    }
    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0, i + 1);
        }
        return result;
    }
}
