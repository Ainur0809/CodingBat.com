package org.example.warmup1;

public class StringE {
    public static void main(String[] args) {
        StringE obj = new StringE();
        System.out.println(obj.stringE("Hello"));
    }
    public boolean stringE(String str) {
        int count = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
        }

        return (count >= 1 && count <= 3);
    }
}
