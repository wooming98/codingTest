import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int m = 0;
        for (int i = 0; i < k; i++) {
            int n = 0;
            int a = sc.nextInt();
            for (int j = 1; j <= a; j++) {
                if (a % j == 0) {
                    n++;
                }
            }
            if (n == 2) {
                m++;
            }
        }
        System.out.println(m);
    }
}