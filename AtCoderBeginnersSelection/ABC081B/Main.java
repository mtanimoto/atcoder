package ABC081B;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        while (canNext(a)) {
            count++;
            a = divide(a);
        }

        System.out.println(count);
    }

    private static boolean canNext(int[] input) {
        for (int n : input) {
            if ((n % 2) == 1) {
                return false;
            }
        }
        return true;
    }

    private static int[] divide(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i] / 2;
        }
        return output;
    }
}