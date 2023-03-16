import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger moneyCount = sc.nextBigInteger();
        BigInteger peopleCount = sc.nextBigInteger();


        System.out.println(moneyCount.divide(peopleCount));
        System.out.println(moneyCount.mod(peopleCount));
    }
}