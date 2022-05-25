import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		/* Scanner와 함께 do~while문으로 사용자가 입력하는 
		 * 값으로 구구단 결과가 출력되는 프로그램을 제작하시오.
		 */
Scanner aa = new Scanner(System.in);
System.out.println("구구단 숫자를 입력하세용");
int a = aa.nextInt();
int b =1;
int aws;
do {
	aws=a*b;
	System.out.printf("%d ",aws);
	b++;
}
while(b<10);
aa.close();
	}

}
