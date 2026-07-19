package org.example.warmup2;

public class DoubleX {
    public static void main(String[] args) {
        DoubleX obj = new DoubleX();
        System.out.println(obj.doubleX("axxbb"));
    }
    boolean doubleX(String str) {

        for (int i = 0; i<str.length()-1; i++){
            if(str.charAt(i) == 'x'){
                if (str.charAt(i+1) != 'x'){
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
