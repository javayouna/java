
public class Do2 {

	public static void main(String[] args) {
		
		int a = 1; //반복문 기초값
		int b = 9; //산술 고정 값 변경안됨
		int c;
		do {
c=a*b;
//System.out.print(c+" ");
	  	a++;
	}while(a<10);
		
		
		
		/*응용문제
		 * 다음 결과값을 보고 do~while문으로 코드를 작성하세요.
		 * 35 45 55 65 75
		 */
		int aa = 3;
		int bb;
		do {
			bb=aa*10+5;
			System.out.print(bb+" ");
			aa++;
			}while(aa<=7);
}
}
