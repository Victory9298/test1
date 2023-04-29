public class Exercitiu18 {
    public static void main(String[] args) {
        int [] myArray = new int[10];

        int i = 0;
        int min = myArray[0];

        do {
            myArray[i] = i;
            if (min > myArray[i]) {
                min = myArray[i];
            }
            i++;
        } while (i < myArray.length);
        System.out.println("Min: " + min);
    }
}
