import java.util.Arrays;

/*
Creati un array de numere intrege, care sa ocupe cel mai mic spatiu de memorie (dupa tip). La output va fi afisat acest
array, iar ulterior elementul dupa pozitia 4 dupa indice ii va fi schimbata valoarea si array va fi reafisat
 */
public class Exercitiu15 {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        for (int i = 0; i < 5; i++) {
            myArray[i] = i;
        }
        System.out.println(Arrays.toString(myArray));
        myArray[4] = 5555;
        System.out.println(Arrays.toString(myArray));
    }
}
