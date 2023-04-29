import java.util.Scanner;

/*
Scrieti un program Java care sa afiseaza adunarea, scaderea, inmultirea, impartirea si restul de la impartire
a doua numere
 */
public class Exercitiu3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul1: ");
        int numar1 = sc.nextInt();
        System.out.println("Introduceti numarul2: ");
        int numar2 = sc.nextInt();
        int adunarea = numar1 + numar2;
        System.out.println(numar1 + " + " + numar2 + " = " + adunarea);
        int scaderea = numar1 - numar2;
        System.out.println(numar1 + " - " + numar2 + " = " + scaderea);
        int inmultirea = numar1 * numar2;
        System.out.println(numar1 + " * " + numar2 + " = " + inmultirea);
        int impartirea = numar1 / numar2;
        System.out.println(numar1 + " / " + numar2 + " = " + impartirea);
        int restul = numar1 % numar2;
        System.out.println(numar1 + " % " + numar2 + " = " + restul);

    }
}
