import java.util.Scanner;
//import:java에 있는 파일을 로드할 때
//export:java에 있는 파일을 내보낼 때 
//java.util 패키지 안에 Scanner 클래스 부분을 로드 하게 됩니다.
//java.util 패키지는 그냥 사용 하지 못하며 new을 할당하여 구분자를 사용해야 합니다.
//단, 해당 코드 위치가 작성 코드보다 아래에 있으면 안됩니다.

public class if4 {

	public static void main(String[] args) {
		//// new:객제 선언

		Scanner a = new Scanner(System.in);
		//System.in(입력) !=System.out(출력)
		System.out.println("아이디를 입력하세요.");
		String mid = a.next();
		//next():사용자가 입력하는 형태를 말합니다. (숫자,문자를 입력 받는 형태)
		System.out.println(mid)
		}
	}


