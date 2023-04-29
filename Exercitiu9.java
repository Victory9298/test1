import java.util.Scanner;

/*
(switch) Creati un program care accepta ca argument numarul lunii (de la 1 la 12) si afiseaza
anotimpul caruia ii apartine aceasta luna (iarna, primavara, vara, toamna)
1-2, 12 iarna
3-5 primavara
6 - 8 vara
9 - 11 - toamna
 */
public class Exercitiu9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul lunii: ");
        int luna = sc.nextInt();
        switch (luna) {
            case 1:
                System.out.println("Iarna");
                break;
            case 2:
                System.out.println("Iarna");
                break;
            case 3:
                System.out.println("Primavara");
                break;
            case 4:
                System.out.println("Primavara");
                break;
            case 5:
                System.out.println("Primavara");
                break;
            case 6:
                System.out.println("Vara");
               break;
            case 7:
                System.out.println("Vara");
                break;
            case 8:
                System.out.println("Vara");
                break;
            case 9:
                System.out.println("Toamna");
                break;
            case 10:
                System.out.println("Toamna");
                break;
            case 11:
                System.out.println("Toamna");
                break;
            case 12:
                System.out.println("Iarna");
                break;
            default:
                System.out.println("Eroare");
        }
    }
}
