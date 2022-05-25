
public class If {

	public static void main(String[] args) {
		
int a=100;
int b=100;
//조건문(if~else)

if(a > b) {
	System.out.println("a값이 더 큽니다.");//if문 예 회원가입 아이디 가입 등
	}
else if(a < b) {
	System.out.println("b값이 더 큽니다.");//else if문
}
else { //else문
System.out.println("두 값이 같습니다.");
}
/* else문이 없는 경우*/
if(a > b) {
	System.out.println("a값이 더 큽니다.");
}
else if(a < b) {
	System.out.println("b값이 더 큽니다.");
	}
else if(a == b) {
	System.out.println("두 값이 같습니다.");
	}
/*부등호기호:<,>,<=.>=,== */


}
	
}