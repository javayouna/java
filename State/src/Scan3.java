import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {
		
Scanner k = new Scanner(System.in);
System.out.println("Q:사용자가 원하는 숫자를 입력하세요.");
int z = k.nextInt();

//%는 나머지 값 
if(z % 2==0) { 
	System.out.println("짝수 값입니다.");
}
	else {
		System.out.println("홀수 값입니다.");
	}
}


	}


