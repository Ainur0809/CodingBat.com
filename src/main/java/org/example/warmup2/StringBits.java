package org.example.warmup2;

public class StringBits {
    public static void main(String[] args) {
        StringBits obj = new StringBits();
        System.out.println(obj.stringBits("Hello"));
    }
    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }
}
