import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = "";
        for (int i = 0; i < 8; i++) {
            int n = scanner.nextInt();
            s += "" + n;
        }

        if (s.equals("12345678")) {
            System.out.println("ascending");
        } else if (s.equals("87654321")) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}