import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/* 응용문제7 
		 사용자가 다음 질문을 확인하여 값을 입력 후 해당 결과를 돌출하는 프로세서 제작
		 "첫 번째 입력값 단(1~10까지) 입니다."
		 "두 번째 입력값 단(1~10까지) 입니다."
		 "세 번째 입력값 단(1~10까지) 입니다."
		 "마지막 질문 입니다. 해당 세가지 값에 대한 산술기호를 적으시오" 
		 
		 해당 산술기호에 맞게 산술식을 적용하여 최종값을 출력시키세요.
		 */
		
		/*Scanner ww = new Scanner(System.in);
		System.out.println("첫 번째 입력값 단(1~10까지) 입니다.");
		int user=ww.nextInt();
		System.out.println("두 번째 입력값 단(1~10까지) 입니다.");
		int user2=ww.nextInt();
		System.out.println("세 번째 입력값 단(1~10까지) 입니다.");
		int user3=ww.nextInt();
		System.out.println("마지막 질문 입니다. 해당 세가지 값에 대한 산술기호를 적으시오.");
		int user4=ww.nextInt();
		int sum=0;
	    if(user4==+) {
	    	sum=sum+(user+user2+user3);
	    	System.out.println(sum);}
	    }
	    	if(user4==-) {*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 입력값 단(1~10까지) 입니다.");
		int no1 =sc.nextInt();
		System.out.println("두 번째 입력값 단(1~10까지) 입니다.");
		int no2 =sc.nextInt();
		System.out.println("세 번째 입력값 단(1~10까지) 입니다.");
		int no3 =sc.nextInt();
		System.out.println("해당 세가지 값에 대한 산술기호를 적으시오.");
		String ms = sc.next(); //next로 받아야함
		
		if(ms.equals("+")) {
			System.out.println(no1+no2+no3);
	    }
		
		else if (ms.equals("-")) {
		System.out.println(no1-no2-no3);
		}
		
		else if(ms.equals("*")) {
			System.out.println(no1*no2*no3);
		}
		
		else {
			System.out.println(no1/no2/no3);
		}
	    
		
		sc.close();
	
	}

}
