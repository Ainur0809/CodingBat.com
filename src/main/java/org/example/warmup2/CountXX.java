package org.example.warmup2;

public class CountXX {
    public static void main(String[] args) {
        CountXX obj = new CountXX();
        System.out.println(obj.countXX("abcxx"));
    }
    int countXX(String str) {
        int count = 0;
        for (int i = 0; i<str.length()-1; i++){
            if (str.substring(i, i+2).equals("xx")){
                count++;
            }
        }
        return count;
    }
}
