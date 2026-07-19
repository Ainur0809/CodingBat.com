package org.example.warmup1;

public class MonkeyTrouble {
    public static void main(String[] args) {
        MonkeyTrouble obj = new MonkeyTrouble();
        System.out.println(obj.monkeyTrouble(true, true));
    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile || !aSmile && !bSmile) {
            return true;
        }
        return false;
    }
}
