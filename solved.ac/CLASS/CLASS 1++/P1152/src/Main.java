import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringInput = sc.nextLine();

        StringTokenizer st = new StringTokenizer(stringInput);

        System.out.println(st.countTokens());
    }
}