import java.util.Scanner;

public class Test2 {
/*
 * 응용문제 - 조건문
고객이 자신의 통장에서 입,출금이 되는 프로세서 제작해야한다.
고객의 기본 자산:100,000원
“1번 입력시 입금, 2번 입력시 출금입니다.” 문구가 제일 먼저 실행 되어야 함

1번 press-”해당 금액을 입력하세요”
사용자가 입력한 금액 + 기본 자산 금액
총 자산금액 출력하면 됨
ex 3,000원 입력시 3,000+100,000 총 103,000원

2번 press-”출금할 금액을 입력하세요”
사용자가 입력한 금액-기본 자산금액 
총 자산금액 출력하면 됨

 * 
 * 
 */
	public static void main(String[] args) {
		Scanner aa = new Scanner(System.in);
		System.out.println("1번 입력시 입금, 2번 입력시 출금입니다.");
		int ee = aa.nextInt();
		int gg = 100000;
		int sum;
		
			if (ee == 1) {
				System.out.println("입금할 금액을 입력하세요.");
				int mm = aa.nextInt();
				sum = gg + mm;
				System.out.println("총 " + sum + " 원");
	
				}
			else if (ee == 2) {
				System.out.println("출금할 금액을 입력하세요.");
				int mm = aa.nextInt();
				sum = gg - mm;
				System.out.println("총 " + sum + " 원");
				}
			else {
				System.out.println("정상적인 코드가 아닙니다.");
				aa.close();
				}
	

	}

}
