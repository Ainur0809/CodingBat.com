package org.example.warmup1;

public class ParrotTrouble {
    public static void main(String[] args) {
        ParrotTrouble obj = new ParrotTrouble();
        System.out.println(obj.parrotTrouble(true,6));
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour<7 || hour>20)) {
            return true;
        }
        return false;
    }
}
