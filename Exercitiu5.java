import java.util.Scanner;

/*
Scrieti un program Java in care sa scrieti o parola, iar ulterior la output va fi afisata parola
 */
public class Exercitiu5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input password: ");
        String parola = sc.nextLine();
        System.out.println("Password was: " + parola);
    }
}
