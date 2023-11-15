package Week_1;

import java.util.Random;
import java.util.Scanner;

public class StressTest {
    public static void main(String[] args) {
        while (true) {
            int n = new Random().ints(1,0,1000).toArray()[0] + 2;
            System.out.println("N vaut: " + n);

            int[] numbers = generateArray(n);

            long res1 = MaxPairwiseProduct.getMaxPairwiseProduct(numbers);
            long res2 = MaxPairwiseProduct2.maximumPairwiseProduct2(numbers);

            if(res1 != res2) {
                System.out.println("Wrong answer : " + res1 + ' ' + res2);
                break;
            }        else {
                System.out.println("Correct OK");
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre de chiffres à gérer");
        int n = scanner.nextInt();
        System.out.println("Entrez les chiffres");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(MaxPairwiseProduct2.maximumPairwiseProduct2(numbers));

    }

    public static int[] generateArray ( int n){
        int[] randomArray = new Random().ints(n, 0, 100000).toArray();
        System.out.println("====== Table of random ========");
        for (int j : randomArray) {
            System.out.print(j + " ");
        }
        System.out.println();

        return randomArray;
    }
}
