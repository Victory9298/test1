/*
Scrieti toate numere pare de la 1 la 10
 */
public class Exercitiu6 {
    public static void main(String[] args) {

       for (int i = 1; i <= 100; i++) {
           if (i % 2 == 0) {
               System.out.println(i);
           }
       }
    }
}
