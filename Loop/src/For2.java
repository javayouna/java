
public class For2 {

	public static void main(String[] args) {
		int a; //for문 초기값
		int b=2; //연산에 사용할 변수 
		int c; //연산한 결과값 사용
		for(a=1;a<=9;a++) {
			c=b*a; //산술연산 작업
			//System.out.print(c+","); //연산된 결과값을 출력
		}
		/*
		응용문제
		다음 결과값을 보고 코드를 작성하세요.
		45,40,35,30,25,20,
		*/
		int aa; //for변수 값
		int bb=5; //5배수 값
		int cc; //계산 값 
		for(aa=9;aa>=4;aa--) {
			cc=aa*bb;
		//	System.out.print(cc+",");
		}

	/*
	 응용문제
	 다음 결과값을 확인 후 코드를 제작하여 출력하세요.
	 11,22,33,44,55,66,77,88,99,*/
		
		int q;
		int w=11;
	    int e;
	    for(q=1;q<10;q++) {
	    	e=q*w;
	    	System.out.print(e+",");
	    }
	}
}
