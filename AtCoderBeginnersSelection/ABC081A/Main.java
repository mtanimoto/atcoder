package ABC081A;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String n = sc.next();

        int output = 0;
        for (int i = 0; i < n.length(); i++) {
            output += Character.getNumericValue(n.charAt(i));
        }
        // 出力
        System.out.println(output);
    }
}