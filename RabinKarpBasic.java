import java.util.Scanner;

// quiz
public class RabinKarpBasic {
    public static void search(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();                                    

        for (int i = 0; i <= n - m; i++) {
            String sub = text.substring(i, i + m);
            if (sub.equalsIgnoreCase(pattern)) {
                System.out.println("Pattern found at index: " + i);
            }   
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
