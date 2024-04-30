import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int customers = scanner.nextInt();
        for (int i = 0; i < customers; i++) {
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int N = scanner.nextInt();

            String a = "";
            String b = "";
            if (N % H == 0) {
                a = H + "";
                b = (N / H) + "";
            } else {
                a = N % H + "";
                b = (N / H + 1) + "";
            }

            if (b.length() == 1) {
                b = "0" + b;
                System.out.println(a + b);
            } else {
                System.out.println(a + b);
            }
        }
    }
}