
public class For1 {

	public static void main(String[] args) {
		/* 구구단 2~3단 출력 */
		int f, ff; //반복문에 사용 할 변수 선언을 미리 하였음
			for(f=2;f<=3;f++) { //큰 반복문 2~3까지만 회전함 
				for(ff=1;ff<=9;ff++) { //작은 반복문 1~9까지 회전함
				//해당 작은 반복문이 작동할 때 마다 출력을 사용함 
		//		System.out.println(f+"*"+ff);
			}
			
		}
		
			/* 응용문제 구구단 5~7단까지 출력하되  4까지만 연속적으로 나오는 수식구를 출력하세요.
			 * 해당 결과값의 총 합계를 출력하세요.
			 * */
		
		  int a, aa;
		  int sum=0;
		   for (a=5;a<=7;a++) {
			   for(aa=1;aa<=4;aa++) {
				   sum=sum+(a*aa); 
			   }
			   }
	          System.out.println(sum);


		
		
		
		
	}
	}
	
