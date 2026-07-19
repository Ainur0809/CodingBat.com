package org.example.warmup2;

public class FrontTimes {
    public static void main(String[] args) {
        FrontTimes obj = new FrontTimes();
        System.out.println(obj.frontTimes("Chocolate", 2));
    }
    public String frontTimes(String str, int n) {
        String word = "";
        for (int i=1; i<=n; i++){
            if (str.length()>3){
                word+= str.substring(0, 3);
            } else {
                word += str;
            }
        }
        return word;
    }
}
