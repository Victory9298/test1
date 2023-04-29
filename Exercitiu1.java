/* Scrieti un program Java care sa printeze rezultatele urmatoarelor operatiuni:
-6+8*6
(44+8)%5
19+3*2/8
5+20/3*2-8%4
 */
public class Exercitiu1 {
    public static void main(String[] args) {

        int rezultat1 = -6 + 8 * 6;
        System.out.println("-6 + 8 * 6 = " + rezultat1);

        int rezultat2 = (44 + 8) % 5;
        System.out.println("(44 + 8) % 5 = " + rezultat2);

        int rezultat3 = 19+ 3 * 2 / 8;
        System.out.println("19+ 3 * 2 / 8 = " + rezultat3);

        int rezultat4 = 5 + 20 / 3 * 2 - 8 % 4;
        System.out.println("5 + 20 / 3 * 2 - 8 % 4 = " + rezultat4);
    }
}
