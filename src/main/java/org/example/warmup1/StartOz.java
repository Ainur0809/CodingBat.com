package org.example.warmup1;

public class StartOz {
    public static void main(String[] args) {
        StartOz obj = new StartOz();
        System.out.println(obj.startOz("ozymandias"));
    }
    public String startOz(String str) {
        if (str.length()>0){
            if (str.length()==1 && str.substring(0,1).equals("o")){
                return "o";
            }else if (str.substring(0,2).equals("oz")){
                return "oz";
            } else if (str.substring(0,1).equals("o")){
                return "o";
            } else if (str.substring(1,2).equals("z")){
                return "z";
            }
        } return "";
    }
}
