
public class Example4 {

	public static void main(String[] args) {
		/* 
		 응용문제 4
		 다음 결과값에 맞춰서 코드가 출력 되도록 하세요.
		 해당 코드는 for문으로 작성하세요.
		 
		 45 35 25 15 10
		 */

		int i;
		int v;
		for(i=9;i>0;i--) {
		v=5*i;
			if(i%2==1 || i==2) { //if(i%2==1 || i==2 || i!=1)
				if(i!=1) {
		System.out.print(v+" ");
				}
		}
		}
	//	 if(i%5==0) 	
		//	 System.out.print(" "+i);
		 //}
	
		
		
		
	}

}
