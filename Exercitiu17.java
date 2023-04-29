/*
Array, valoarea cea mai mare
 */
public class Exercitiu17 {
    public static void main(String[] args) {
        int [] myArray = new int[10];

        int i = 0;
        int max = myArray[0];

        do {
            myArray[i] = i;
            if (max < myArray[i]) {
                max = myArray[i];
            }
            i++;
        } while (i < myArray.length);
        System.out.println("Max: " + max);
    }
}
