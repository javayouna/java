
public class For_plus {

	public static void main(String[] args) {
		/*1~10까지 모든 숫자를 합한 결과값을 출력하시오. */
		int f;
		int total=0;
		for(f=1;f<11;f++) { //total변수값에 반복값을 지속적으로 증가시킴 
			//total = total +f; 
		total+=f;
		}
		//System.out.println("총합계:"+total);
		
		//+=(더하기할당) -=(빼기할당) *=(곱하기할당) /=(나누기할당)
		//b=b-f; -> b-=f;
		
		/*
		 응용문제
		 전체값은 500이 있습니다. 총 8회 동안 반복되면서 
		 한번 반복 할 때마다 12씩 감소하도록 하여 최종값을 출력하세요.
		 */
		int a;
		int b=12;
		for(a=500;a>9;a--) {
			total=500-b-a;
		}
	//System.out.println("최종값:"+total);
		int alls =500;
		int m=12;
		int w;
		for(w=1;w<9;w++) {
			alls=alls-m;
		}
			System.out.println(alls);
		}
	}
	
	


