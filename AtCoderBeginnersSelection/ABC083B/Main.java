package ABC083B;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> okNumbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            int k = 0;
            for (int j = 0; j < s.length(); j++) {
                k += Character.getNumericValue(s.charAt(j));
            }

            if (a <= k && b >= k) {
                okNumbers.add(i);
            }
        }

        System.out.println(okNumbers.stream().mapToInt(x -> x).sum());
    }
}