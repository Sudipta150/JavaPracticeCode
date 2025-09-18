// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String input ="Hello world";
        boolean[] unique = new boolean[128];
        for(int i =0; i< input.length() ; i++){
            char ch=input.charAt(i);
            if(!unique[ch]){
                unique[ch]=true;
                System.out.print(ch +" ");
            }
        }
    }
}
