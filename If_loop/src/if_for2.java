
public class if_for2 {

	public static void main(String[] args) {
		//1~100까지 숫자 중 80이상의 숫자만 출력
		int f; 
		for(f=1;f<101;f++) {
			
			if(f >= 80) { //반복문에 if를 쓴다는 것은.. 반복문안에서 내가 원하는 것만 뽑고 싶을 때 
			//	System.out.print(f+" ");
			}
			
			
		}
		
		//200~300까지 숫자 중 240 이하 숫자만 출력하시오.
		
		int nu;
		for(nu=200;nu<301;nu++){
			
			if(nu<=240) {
			//	System.out.print(nu+" ");
			}
		}
		
		final int a = 5;
		int w;
		for(w=1;w<11;w++) {
			if(w % a ==0) {
		//		System.out.print(w+" ");
			}
		}
		
		
		//응용문제 구구단 중 2단을 반복합니다. 단 2단 결과값 중 10이상 숫자만 출력합니다.
		
		final int g=2;
		int ww;
		int total;
		for(ww=1;ww<=9;ww++){
			
			total=g*ww;
			if(total>10) {
		//	System.out.println(total); //
		}
		
		}	
		
		
		/*응용문제
		  다음 결과값을 보고 해당 값이 출력 되도록 코드를 제작하시오.
		  18, 36, 54, 72 
		 */
		
		final int aa=18;
		int bb;
		int sum;
		for(bb=1;bb<=9;bb++) {
			sum=aa*bb;
			if(sum<73) {
		//		System.out.print(sum+" ");
			}
		} //내가 푼 답
     
		 int p;
		 int total3;
		 for(p=1;p<10;p++) {
			 total3=p*9;
			 if(p%2==0){
			 //System.out.println(total3+" ");
		 }
		 } 
		
		/* 응용문제
		 * 다음 결과값을 보고 해당 값이 출력되도록 코드를 제작하시오.
		 1~20 사이의 숫자 입니다.
		 6 14 17 19
		 */
		 int k;
		 for(k=1;k<21;k++) {
			 if(k==6||k==14||k==17||k==19){
			 System.out.print(k+" ");
		 }
		 }
	
	
	
	
	
	
	}
	
	
	
}


