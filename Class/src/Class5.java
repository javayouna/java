import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Member2.list2(); //메로리에서 로드 
		Member2 mb2 = new Member2(); //static이 없는 함수이므로 객체 및 인스턴스를 생성 
		mb2.lists(); //인스턴스(메모리)에 있는 메소드를 로드하게 됨
		
		Member2.list3("유관순",123456);	
		
		/*응용문제 for_in라는 일반 메소드가 있습니다.
		 프로그램 실행시 다음과 같이 질문을 합니다.
		 "사용하실 구구단 숫자를 하나 입력해주세요."
		 [결과]-해당 메소드에서 결과를 출력해야함 
		 만약 사용자가 3단을 입력시
		 3*1=3... 3*9=27 출력되야함  for문으로
		 */
		
		Scanner huhu = new Scanner(System.in);
		System.out.println("사용하실 구구단 숫자를 하나 입력해주세요.");
		
		int user = huhu.nextInt();
		 Member2.for_in(user);
		 huhu.close();
		 }

	}


class Member2 {
	public void lists() { //메모리에 별도 할당없이 메소드 함수만 선언
		String a ="홍길동"; 
		System.out.println(a);
		
	}
	public static void list2() {
		String a = "이순신";
		System.out.println(a);
	}
	public static void list3(String nm,int pw) {
		//nm을 메소드에서 전달 받는 값을 바로 사용할 경우 (nm.equals("유관순"))
		int user_pw=pw; //메소드에 객체값을 첨부하여 로드 후 메소드안에 별도의 필드명을 이용하여 전달 받는 형식
		if(nm.equals("유관순") && user_pw==123456) {
			System.out.println("회원 확인이 되었습니다.");
		}
			else {
				System.out.println("비회원 입니다.");
			}	
	}

public static void for_in(int z) {
	int f;
	for(f=1; f<10; f++) {
		System.out.printf("%d * %d = %d ",z,f,(z*f));
	}
}
}