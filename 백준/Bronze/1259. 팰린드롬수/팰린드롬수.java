import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if (s.equals("0")) {
                break;
            }
            String r = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                r += s.charAt(i);
            }
            if (s.equals(r)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}