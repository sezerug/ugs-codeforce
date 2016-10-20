package tr.com.ugs.codeforce.a;


import java.util.Scanner;

/**
 * Created by usezer on 27.07.2016.
 */
public class Q678A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int o = (n - (m % n)) + m;
        System.out.println(o);
    }
}