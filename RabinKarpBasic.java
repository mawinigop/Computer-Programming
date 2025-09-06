import java.util.Scanner;

public class RabinKarp {
    public static void search(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();
        boolean found = false;                                    

        for (int i = 0; i <= n - m; i++) {
            String sub = text.substring(i, i + m);
            if (sub.equalsIgnoreCase(pattern)) {
                System.out.println("Pattern found at index: " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Pattern not found");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = input.nextLine();
        System.out.print("Enter the pattern: ");
        String pattern = input.nextLine();
        System.out.println();
        search(text, pattern);
    }
}
