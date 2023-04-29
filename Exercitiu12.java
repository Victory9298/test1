import java.util.Scanner;

/*
Pina la 12 copil; 12-18 adolescent; 18 - 135 adult
 */
public class Exercitiu12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int age = sc.nextInt();
        if (age < 0 || age > 135) {
            System.out.println("Eroare");
        }
        else if (age >= 0 && age < 13) {
            System.out.println("Copil");
        }
        else if (age >= 13 && age < 18) {
            System.out.println("Adolescent");
        }
        else if (age >= 18 && age <= 135) {
            System.out.println("Adult");
        }

    }
}
