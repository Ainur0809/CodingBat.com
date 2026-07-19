package org.example.warmup1;

public class Front3 {
    public static void main(String[] args) {
        Front3 obj = new Front3();
        System.out.println(obj.front3("Java"));

    }
    public String front3(String str) {
        if (str.length()>2){
            String front = str.substring(0,3);
            return front+front+front;
        } return str+str+str;
    }
}
