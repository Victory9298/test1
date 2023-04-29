import java.util.Scanner;

//Scrieti un program Java care ia doua numere introduse de la tastatura si afiseaza la ecran rezultatul
//inmultirii acestor numere
public class Exercitiu2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul 1:");
        int numar1 = sc.nextInt();
        System.out.println("Introduceti numarul 2: ");
        int numar2 = sc.nextInt();
        int rezultatul = numar1 * numar2;
        System.out.println(numar1 + " * " + numar2 + " = " + rezultatul);

    }
}
