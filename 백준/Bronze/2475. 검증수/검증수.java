import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        String[] array = n.split(" ");
        double answer = 0;
        for(String s : array) {
            answer += Math.pow(Integer.parseInt(s), 2);
        }
        answer %= 10;
        System.out.println((int)answer);
    }
}