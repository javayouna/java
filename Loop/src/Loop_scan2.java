import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {
		/* Scanner�� �Բ� while������ ����ڰ� �Է��ϴ� 
		 * ������ ������ ����� ��µǴ� ���α׷��� �����Ͻÿ�.
		 */
     Scanner aa = new Scanner(System.in);
     System.out.println("������ ���ڸ� �Է��ϼ���~");
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
