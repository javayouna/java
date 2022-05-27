import java.util.Scanner;

public class Homework2 {
	/*
	 * 사용자가 입력한 숫자에 맞춰서 구구단이 작동되며, 총합을 계산하여 짝수인지 홀수인지 출력하세요. 
	 * "구구단 숫자를 입력하세요?"라고 메세지가
	 * 출력되면 해당 숫자에 맞춰서 모든 결과를 더하며, 더한 값에 따라 짝수인지 홀수인지를 출력하시면 됩니다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = "구구단 숫자를 입력하세요.";
		String msg2; //메세지 부분
		System.out.println(msg);
		int user = sc.nextInt();
		int f = 1;
		int total = 0; // 다 더해야해서 1아니고 0쓴거임
		do {
			total = total + (user * f);
			f++;
		} while (f < 10);
	//System.out.println(total); 합계나옴
		if(total%2==0) {
			msg2="짝수";
		}
		else {
			msg2="홀수";
		}
		System.out.println("결과값은 "+msg2+" 입니다.");
	 
	
	
	
	}
}
