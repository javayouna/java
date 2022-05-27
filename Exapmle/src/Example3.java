import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
	
	/*
	 응용문제3
	 사용자가 해당 값을 입력합니다.
	 단, 사용자 두 개의 숫자를 입력하되 
	 첫번 째 숫자와 두번 째 숫자 범위
	 안에 있는 모든 숫자를 더해서 결과값이 나오도록 제작하세요.
	 단, 해당 코드는 do~while 문으로 작성
	 
	 예시;
	 첫 번째 범위 숫자는? 5
	 두 번째 범위 숫자는? 10
	 범위 숫자 모든 합계는: 45입니다.
	 */
	
   /*Scanner tt = new Scanner(System.in);
	System.out.println("첫 번째 숫자를 입력해주세요.");
	int user1 = tt.nextInt();
	
	Scanner tt2 = new Scanner(System.in);
	System.out.println("두 번째 숫자를 입력해주세요.");
	int user2 = tt2.nextInt();
	int total = 0;
	
	 	do {
	 		total=total+user1+user2;
	 		user1++;
	 	}
	 	while(user1<=user2);
	System.out.println("범위 숫자 모든 합계는 :"+total+"입니다.");
	
	tt.close();
	tt2.close(); */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 범위 숫자는?");
		int a = sc.nextInt();
		System.out.println("두 번째 범위 숫자는?");
	    int b = sc.nextInt();
	    int total =0;
	    do {
	    	total=total+a;
	    	a++;
	    }
	    while(a<=b);
	    System.out.println("범위 숫자 모든 합계는 "+total+"입니다.");
	    sc.close();
	    
	
	
	
	
	}

}
