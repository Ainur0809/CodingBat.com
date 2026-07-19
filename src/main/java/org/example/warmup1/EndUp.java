package org.example.warmup1;

public class EndUp {
    public static void main(String[] args) {
        EndUp obj = new EndUp();
        System.out.println(obj.endUp("Hello"));
    }

    public String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        }
        return str.substring(0, str.length() - 3) + str.toUpperCase().substring(str.length() - 3);
    }
}
