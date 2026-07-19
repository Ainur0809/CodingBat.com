package org.example.string1;

public class MakeTags {
    public static void main(String[] args) {
        MakeTags obj =  new MakeTags();
        System.out.println(obj.makeTags("i", "Yay"));
    }
    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }

}
