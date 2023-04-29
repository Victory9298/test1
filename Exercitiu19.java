import java.util.Scanner;

public class Exercitiu19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti Litera: ");
        String litera = sc.next();

        switch (litera) {
            case "V":
                System.out.println("Verde");
                break;
            case "R":
                System.out.println("Rosu");
                break;
            case "G":
                System.out.println("Galben");
                break;
            default:
                System.out.println("n-am gasit culoarea");

        }
    }
}
