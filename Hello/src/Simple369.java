import java.util.Scanner;

public class Simple369 {
	public static void main(String[] args) {
        // 사용자에게 숫자 입력을 요청합니다.
        System.out.print("Enter integer value 1~99 : ");

        // Scanner 객체를 생성하여 사용자의 입력을 받습니다.
        Scanner sn = new Scanner(System.in);
        int x = sn.nextInt();

        // 입력받은 숫자를 10으로 나누어 십의 자리와 일의 자리를 구합니다.
        int x_10 = x / 10;
        int x_1 = x % 10;

        // 박수 카운트를 저장할 변수를 초기화합니다.
        int count = 0;

        // 십의 자리와 일의 자리가 3의 배수인지 확인하고, 0이 아닌 경우 카운트를 증가시킵니다.
        if (x_10 % 3 == 0 && x_10 != 0) {
            count++;
        }
        if (x_1 % 3 == 0 && x_1 != 0) {
            count++;
        }

        if (count == 0) {
            // 3, 6, 9가 없는 경우 "NO 3, 6, or 9"를 출력합니다.
            System.out.println("NO 3, 6, or 9");
        } else {
            // 박수를 치는 경우를 처리합니다.
            String p = "박수";
            for (int i = 0; i < count; i++) {
                // 박수 카운트만큼 "짝"을 추가합니다.
                p = p + "짝";
            }

            // 최종 박수 문자열을 출력합니다.
            System.out.println(p);
        }
        
        
        
        

        // Scanner 객체를 닫습니다.
        sn.close();
    }

}
