package org.example.string1;

public class MakeOutWord {
    public static void main(String[] args) {
        MakeOutWord obj =  new MakeOutWord();
        System.out.println(obj.makeOutWord("<<>>", "Yay"));
    }
    public String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(2);
    }

}
