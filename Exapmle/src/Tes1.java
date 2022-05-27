import java.util.Scanner;

public class Tes1 {

	public static void main(String[] args) {
	/*
	  응용 문제

사용자가 입력하여 조건에 맞는 메세지를 출력하시오.
첫 번째 숫자 값을 입력하세요 
      2 .  두 번째 숫자 값을 입력하세요.

 첫 번째 숫자 값*두 번째 숫자 값 결과 출력
 단, 해당 결과값이 100 이하면 -> “100이하의 결과값 입니다.”
100 이상이면 ->”해당 값은 100이상 결과값 입니다.”

내일은 반복문->선택문(쉬움)->반복+조건/ 반복+선택/ 반복+선택+조건->

	 */

		Scanner ww = new Scanner(System.in);
		System.out.println("첫 번째 숫자 값을 입력하세요.");
		int user1 =ww.nextInt();
		
		Scanner ee = new Scanner(System.in);
		System.out.println("두 번째 숫자 값을 입력하세요");
		int user2 =ee.nextInt();
		
		
		int user3=user1*user2;
			if(user3<=100) {
			System.out.println("100이하의 결과값 입니다.");
		}
			else{
			System.out.println("해당 값을 100이상 결과값 입니다.");
		}
		
	ww.close();
	ee.close();

	}

}
