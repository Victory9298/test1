import java.util.Scanner;

/*
Scrieti un program ce ii permite utilizatorului sa introduca ceva de la tastatura. Utilizatorul va scrie un numar, iar
programul ii va spune daca numarul introdus este par sau impar.
 */
public class Exercitiu7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numar: ");
        int numar = sc.nextInt();
        if (numar % 2 == 0) {
            System.out.println(numar + " este numarul par");
        }
        else {
            System.out.println(numar + " este numarul impar");
        }
    }
}
