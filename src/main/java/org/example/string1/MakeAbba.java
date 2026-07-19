package org.example.string1;

public class MakeAbba {
    public static void main(String[] args) {
        MakeAbba obj = new MakeAbba();
        System.out.println(obj.makeAbba("Hi", "Bye"));
    }
    public String makeAbba(String a, String b) {
        return a.concat(b).concat(b).concat(a);
    }
}
