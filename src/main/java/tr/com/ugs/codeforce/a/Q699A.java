package tr.com.ugs.codeforce.a;

import java.util.Scanner;

/**
 * Created by usezer on 11.08.2016.
 */
public class Q699A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        String directions = scanner.next();

        int arr[] = new int[s];

        for (int i = 0; i < s; i++) {
            arr[i] = scanner.nextInt();
        }
        int distance;
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (directions.charAt(i) == 'R' && directions.charAt(i + 1) == 'L') {
                distance = arr[i + 1] - arr[i];
                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
        }

        if (minDistance == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(minDistance / 2);
        }
    }
}
