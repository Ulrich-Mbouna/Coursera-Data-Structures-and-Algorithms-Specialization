package Week_1;

import java.util.Scanner;

public class MaxPairwiseProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre de chiffres à gérer");
        int n = scanner.nextInt();
        System.out.println("Entrez les chiffres");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    public static long getMaxPairwiseProduct(int[] numbers) {
        long result = 0;
        int indexI = -1;
        int indexJ = -1;

        for (int i =0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(((long) numbers[i] * numbers[j]) > result) {
                    result = (long)numbers[i] * numbers[j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.printf("result deep for Loop:  %d * %d \n",numbers[indexI],numbers[indexJ]);

        return result;
    }
}
