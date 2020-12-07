package ABC085C;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int y = sc.nextInt();

        int i = 0;
        int j = 0;
        int k = 0;
        boolean found = false;
        outside: for (i = n; i >= 0; i--) {
            for (j = n - i; j >= 0; j--) {
                for (k = n - i - j; k >= 0; k--) {
                    if (y == (i * 10000 + j * 5000 + k * 1000)) {
                        found = true;
                        break outside;
                    }
                }
            }
        }

        if (!found) {
            i = -1;
            j = -1;
            k = -1;
        }

        System.out.printf("%d %d %d", i, j, k);
    }
}