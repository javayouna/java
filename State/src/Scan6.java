import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		//스캐너 첫번째, sysout 출력하고, 사용자가 입력할 값은 변수로 ! 이건 절때 안 변함
		Scanner mid = new Scanner(System.in);
		System.out.println("접속할 아이디를 입력하세요.");
		String m = mid.next(); //사용자가 아이디 입력
		
		Scanner mpass = new Scanner(System.in);
		System.out.println("패스워드를 입력하세요");
		String p = mpass.next(); // 사용자 패스워드 입력
		
		
	//	System.out.printf("아이디:%s, 패스워드:%s",m,p);//
		
		if(m.equals("jung") || m.equals("su")) {
	if(m.equals("jung")&& p.equals("j1234")) {
	System.out.println("로그인 되셨습니다.");}
	 else if(m.equals("su")&& p.equals("ssh")) {
	 System.out.println("로그인 되셨습니다.");
	 }
	 else {
		System.out.println("회원정보를 다시 확인하세요.");
	}
		}	
	else {
		System.out.println("가입 되지 않은 사용자 입니다.");
	}
	}
}

			
			
	