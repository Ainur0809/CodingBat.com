package org.example.warmup2;

public class AltPairs {
    public static void main(String[] args) {
        AltPairs obj = new AltPairs();
        System.out.println(obj.altPairs("kitten"));
    }
    public String altPairs(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 4) {
            result += str.charAt(i);
            if (i + 1 < str.length()) {
                result += str.charAt(i + 1);
            }
        }

        return result;
    }

}
