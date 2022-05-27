import java.util.Scanner;

public class Homework1 {
	/*
사용자가 입력한 숫자에 맞춰서 구구단이 작동되며,
		 총합을 계산하여 짝수인지 홀수인지 출력하세요.
		 "구구단 숫자를 입력하세요?"라고 메세지가 출력되면 
		 해당 숫자에 맞춰서 모든 결과를 더하며,
		 더한 값에 따라 짝수인지 홀수인지를 출력하시면 됩니다.
 */
	public static void main(String[] args) {
		Scanner gugu = new Scanner(System.in);
		System.out.println("구구단 숫자를 입력하세요~");
		int i = gugu.nextInt();
		int e = 1;
		int sum;
		int total=0;

		for (e = 1; e < 9; e++) {
			sum = e * i;
			total = total + sum;
			}

			if (total % 2 == 0) {
			System.out.println("짝수입니다.");
			}

			else if (total % 2 == 1) {
			System.out.println("홀수입니다.");
			}

	}

}
