import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		/* Scanner�� �Բ� do~while������ ����ڰ� �Է��ϴ� 
		 * ������ ������ ����� ��µǴ� ���α׷��� �����Ͻÿ�.
		 */
Scanner aa = new Scanner(System.in);
System.out.println("������ ���ڸ� �Է��ϼ���");
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
