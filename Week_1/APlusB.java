package Week_1;

import java.util.Scanner;

public class APlusB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre les valeurs des deux nombres");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = sum(a,b);

        System.out.println(result);
    }

    static int sum(int a, int b) {
        return a+b;
    }
}
