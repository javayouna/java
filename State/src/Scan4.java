import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);
			System.out.println("�Է��� ������ �����ּ���!");
		//String memo = a.next();	
			//next():�����̽��� �Է±����� ����
			//nextLine():�����̽��� ���� ��� �Է� ����
	String memo = a.nextLine();
	System.out.println(memo);
	a.close(); //scanner ����� �⺻!
	
   String mid="park"; //String + int =%s
   int age=25; //���ڴ� %d 
   //[�߿����]
   //%f : float,double
   //%t : date, time �ð�, ��¥
   //%b : boolean (true,false)
   
	//System.out.println(mid+"���� ���̴�"+age+"�Դϴ�.");
   //printf: f�� format�� ����
System.out.printf("%s���� ���̴� %s �Դϴ�.",mid,age);
	}


}
