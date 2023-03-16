import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.ROOT;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine().toUpperCase();

        int[] countDict = new int[26];

        // 대문자 알파벳 사전 제작
        int[] count = new int[26];
        for (int i = 0; i < count.length; i++) {
            count[i] = 'A' + i;
        }

        for (int i = 0; i < inputString.length(); i++) {
            for (int j = 0; j < count.length; j++) {
                if (inputString.charAt(i) == (char) count[j]) {
                    countDict[j] += 1;
                }
            }
        }

        int maxCount = 0;
        char answer = '?';

        for (int i = 0; i < countDict.length; i++) {
            if (maxCount < countDict[i]) {
                maxCount = countDict[i];
                answer = (char)count[(int)(maxCount - 2)];
            } else if (maxCount == countDict[i]) {
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}