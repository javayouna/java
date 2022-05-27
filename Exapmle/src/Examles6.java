
public class Examles6 {

	public static void main(String[] args) {
		/* 
		 * 응용문제6
		 * 1~10까지 순차적으로 적용하는 반복문이 있습니다.
		 * 단, 1~5까지는 모든 값을 곱하고, 6~10까지는 더합니다.
		 * 해당 두개의 값을 비교하여 더한 값이 큰지, 급한값이 큰지를
		 * 결과로 출력하세요.
		 */
		
		int i=1;
		int sum=0; //더할거 
		int sum2=1; //곱할거 
		for(i=1;i<=10;i++) {
				if(i<6) {
				sum2=i*sum2;
				}
					if(5<i){
					sum=sum+i;
					}
				}		
		
				if(sum2<sum) {
				System.out.println("더한 값이 더 큽니다");
				}
				else{										//else if 에다가 이걸 쓰고						
				System.out.println("곱한 값이 더 큽니다."); 	//else에는 같습니다. 라고 써도 됌
				}
		

	}

}
