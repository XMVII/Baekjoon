import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase(); // Scanner을 통해 받은 문자열을 대문자로 변환하여 str 변수에 입력.
        int[] arr = new int[26];
        /*
        대문자 alphabet 배열.
        0으로 초기화되어 있고, int형 배열로 선언한 이유는 다음과 같음.
        ASCII 형식으로 문자의 개수를 확인할 것이기 때문.
        대문자 alphabet의 ASCII code 값에서 대문자 A의 ASCII code 값(65)를 빼주면 관리가 가능.
         */

        for (int i = 0; i < str.length(); i++) {
            int temp = (int) (str.charAt(i) - 'A'); // 해당 되는 문자열의 i번째 문자의 ASCII code 값에서 A의 ASCII code 값(65)를 뺌. 이는 arr 배열의 index로 활용 가능.
            arr[temp] = arr[temp] + 1; // temp를 index로 활용하여 해당되는 순서의 배열의 값을 1 증가시킴.
        }

        int max = 0; // arr 배열 중 가장 많이 counting 된 alphabet 개수를 저장.
        int index = 0; // max가 가르키는 arr 배열의 index 값을 저장. 차후 index 값에 A의 ASCII code 값을 더해 출력에 사용할 예정.

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i + 65; // 65는 ASCII code로 'A'를 의미.
            } else if (max == arr[i]) {
                index = 63; // 63은 ASCII code로 '?'를 의미.
            }
        }

        System.out.println((char) index);
    }
}