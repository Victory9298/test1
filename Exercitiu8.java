import java.util.Scanner;

/*
Creati un program care primeste la intrare ora si returneaza ca raspuns care parte a zilei este
0-6 - noapte
7-12 - dimineata
13-18 - ziua
19-24 - seara
 */
public class Exercitiu8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti ora de la 0 pina la 24");
        int ora = sc.nextInt();
        if (ora < 0 || ora > 24) {
            System.out.println("Eroare! Numarul trebuie sa fie intre 0 si 24");
        }
        else if (ora > 0 && ora <= 6) {
            System.out.println("Noapte");
        }
        else if (ora > 6 && ora <= 12) {
            System.out.println("Dimineata");
        }
        else if (ora > 12 && ora <= 18) {
            System.out.println("Ziua");
        }
        else if (ora > 18 && ora <= 24) {
            System.out.println("Seara");
        }
    }
}
