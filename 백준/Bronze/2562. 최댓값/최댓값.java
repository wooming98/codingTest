import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[9];
        for (int i = 0; i < 9; i++) {
            int n = scanner.nextInt();
            array[i] = n;
        }

        int max = array[0];
        int count = 1;
        for (int i = 0; i < 9; i++) {
            if (max < array[i]) {
                max = array[i];
                count = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}