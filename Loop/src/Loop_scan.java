import java.util.Scanner;

public class Loop_scan {

	public static void main(String[] args) {
	//for문+Scanner 
	//원하시는 구구단 숫자를 입력하세요.	
		Scanner aa = new Scanner(System.in); //입력엔진 로드
		System.out.println("원하시는 구구단 숫자를 입력하세요."); //질문사항
		int bb = aa.nextInt(); //사용자가 입력한 내용
		int f; //반복문에 사용하는 변수
		int zz; //반복문에 산술연산 결과값
		for(f=1;f<=9;f++) {
			zz=bb*f; //산술연산
			System.out.printf("%d ",zz); //출력
		}
		aa.close(); //종료 

		
		
		
		
		
		
		
	}

}
