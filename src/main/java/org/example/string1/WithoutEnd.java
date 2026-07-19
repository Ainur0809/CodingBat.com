package org.example.string1;

public class WithoutEnd {
    public static void main(String[] args) {
        WithoutEnd obj =  new WithoutEnd();
        System.out.println(obj.withoutEnd("Hello"));
    }
    public String withoutEnd(String str) {
        if (str.length()>=2) {
            return str.substring(1,str.length()-1);
        }
        return str;
    }

}
