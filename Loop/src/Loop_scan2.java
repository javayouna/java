import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {
		/* Scanner와 함께 while문으로 사용자가 입력하는 
		 * 값으로 구구단 결과가 출력되는 프로그램을 제작하시오.
		 */
     Scanner aa = new Scanner(System.in);
     System.out.println("구구단 숫자를 입력하세요~");
     int b=aa.nextInt();
     int a=1;
     int c;
     while(a<10) {
    	 c=b*a;
    	 System.out.print(c+" "); 
    	 a++;
     }
 
     
    	 aa.close();
     
   
     
   
	}

}
