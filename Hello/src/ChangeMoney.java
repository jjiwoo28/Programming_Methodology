import java.util.InputMismatchException;
import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
//		while(true) {
//			calculateChange();
//		}
		calculateChange();	
	
	}
	
    public static void calculateChange() {
        // 화폐 단위를 배열로 선언
        int[] uint = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        // 각 화폐 단위별로 필요한 개수를 저장할 배열
        int[] counts = new int[uint.length];
        int num = 0;  // 사용자로부터 입력받을 금액

        Scanner sn = new Scanner(System.in);

        // 사용자로부터 금액을 올바르게 입력받을 때까지 반복
        while (true) {
            System.out.print("input price(won): ");
            try {
                num = sn.nextInt();  // 금액 입력
                break;  // 올바른 입력이면 while 루프를 빠져나옴
            } catch (InputMismatchException e) {
                // 잘못된 입력 형식의 경우 예외 처리
                System.out.println("올바른 금액을 입력해주세요.");
                sn.next();  // 잘못된 입력을 클리어
            }
        }

        // 입력받은 금액을 화폐 단위별로 나누어 필요한 개수를 계산
        for (int i = 0; i < uint.length; i++) {
            counts[i] = num / uint[i];
            num = num % uint[i];
        }

        // 계산된 화폐 단위별 필요한 개수를 출력
        for (int i = 0; i < uint.length; i++) {
            System.out.println(uint[i] + ":" + counts[i]);
        }
    }
}