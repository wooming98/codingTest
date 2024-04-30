import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < a; i++) {
            String str = scanner.nextLine();
            int add = 0;
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    add++;
                    sum += add;
                } else {
                    add = 0;
                }
            }
            System.out.println(sum);
        }
    }
}