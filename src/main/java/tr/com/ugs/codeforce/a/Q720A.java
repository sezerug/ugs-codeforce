package tr.com.ugs.codeforce.a;
import java.util.Scanner;

/**
 * Created by usezer on 11.08.2016.
 */
public class Q720A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int arr[] = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = scanner.nextInt();
        }
        int currentMax = 1;
        int max = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                max++;
            } else {
                if (currentMax < max)
                    currentMax = max;
                max = 1;
            }
        }
        System.out.println(currentMax > max ? currentMax : max);
    }
}