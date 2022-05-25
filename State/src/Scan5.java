import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
/*	byte a = 10;
		if(a < 10) {
			System.out.println("입력한 값은 10이상 숫자를 입력하세요.");
		}
		else if (a>=10||a<=22) { //조건문에 범위를 설정,적용
			System.out.println("당첨 입니다");
		}
		else {
			System.out.println("범위 밖의 숫자 입니다.");
		}*/

		
		Scanner a = new Scanner(System.in);
		
			System.out.println("Q.1~45까지 숫자 하나를 입력하세요.");
			int d = a.nextInt();
			if (d ==0) {
				System.out.println("숫자 입력이 잘못 되었습니다.");}
		       	else if (d>45) {
					System.out.println("숫자는 1~45까지만 입력 가능합니다.");
					}
					else {
					 if(d==7||d==12||d==14) {
						System.out.println("당첨 입니다.");	}
						else {
							System.out.println("다음기회에..");
						}
					}
	//응용문제
	//Q. 1~45까지 숫자 하나를 입력하세요.
	//0=숫자입력이 잘못 되었습니다.
	//45보다 큰 숫자:숫자는 1~45까지만 입력 가능합니다.
	

	

	


