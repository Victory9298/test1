import java.sql.Array;
import java.util.Scanner;

/*
Scrieti un program ce primeste un string, iar la output va afisa indicele maxim, dar si cantitatea de caractere
 */
public class Exercitiu11 {
    public static void main(String[] args) {
       String [] arrayLetters = new String[10];
       for (int i = 0; i < 10; i++) {
           arrayLetters[i] = Integer.toString(i);
       }
        System.out.println("Cantitatea = " + arrayLetters.length);
        int maxIndex = arrayLetters.length - 1;
        System.out.println("Indix maxim = " + maxIndex);
    }
}
