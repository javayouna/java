
public class If_dowhile1 {

	public static void main(String[] args) {
		/* 응용문제
		  구구단 6단 중에서 35이상 결과 숫자만 출력하세요!!!!
		 */
     int dw = 1; 
     int total; 
     	do {
     		total=6*dw;
     		if(total > 35) {
     		//System.out.print(total+" ");
     		}
     
     		dw++;
     		}while (dw<10);
 
     	
     	/*응용문제
     	 * 14부터 27까지 숫자 중 짝수값만 모두 더하여 
     	 * 최종 결과값을 출력하세요
     	 */
          int aa =14;
          int toto=0;
          do {
        	     if(aa% 2 == 0 ) {
        	    	 toto=toto+aa;
        	     }
          aa++;
          }while (aa<28);
          System.out.print(aa+" ");
     	
     	
	}
	}


