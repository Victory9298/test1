import java.util.Scanner;

/*
Scrieti un program Java care sa compare 2 numere si sa spuna in rezultat care este mai mic si care mai mare
 */
public class Exercitiu4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul 1: ");
        int numar1 = sc.nextInt();
        System.out.println("Introduceti numarul 2: ");
        int numar2 = sc.nextInt();

        int min, max;
        if (numar1 > numar2) {
          max = numar1;
          min = numar2;
        }
        else if (numar2 > numar1) {
            max = numar2;
            min = numar1;
        }
        else if (numar1 == numar2) {
            max = numar1;
            min = numar2;
        }
        else {
            System.out.println("Eroare");
            max = 0;
            min = 0;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

    }
}
