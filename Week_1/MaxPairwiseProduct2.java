package Week_1;

public class MaxPairwiseProduct2 {
    public static void main(String[] args) {

    }

    public static long maximumPairwiseProduct2(int[] numbers) {
        int n = numbers.length;
        int max_index1 = -1;

        for (int i = 0; i < n ; ++i) {
            if((max_index1 == -1) || (numbers[max_index1] < numbers[i])) {
                max_index1 = i;
            }
        }

        int max_index2 = -1;
        for (int j = 0; j < n ; ++j) {
            if((j != max_index1) && ((max_index2 == -1) || numbers[j] > numbers[max_index2])) {
                max_index2 = j;
            }
        }

        long result = (long)numbers[max_index1] * numbers[max_index2];
        System.out.printf("result find two max:  %d * %d \n",numbers[max_index1],numbers[max_index2]);

        return result;
    }
}
