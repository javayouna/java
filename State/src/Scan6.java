import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		//��ĳ�� ù��°, sysout ����ϰ�, ����ڰ� �Է��� ���� ������ ! �̰� ���� �� ����
		Scanner mid = new Scanner(System.in);
		System.out.println("������ ���̵� �Է��ϼ���.");
		String m = mid.next(); //����ڰ� ���̵� �Է�
		
		Scanner mpass = new Scanner(System.in);
		System.out.println("�н����带 �Է��ϼ���");
		String p = mpass.next(); // ����� �н����� �Է�
		
		
	//	System.out.printf("���̵�:%s, �н�����:%s",m,p);//
		
		if(m.equals("jung") || m.equals("su")) {
	if(m.equals("jung")&& p.equals("j1234")) {
	System.out.println("�α��� �Ǽ̽��ϴ�.");}
	 else if(m.equals("su")&& p.equals("ssh")) {
	 System.out.println("�α��� �Ǽ̽��ϴ�.");
	 }
	 else {
		System.out.println("ȸ�������� �ٽ� Ȯ���ϼ���.");
	}
		}	
	else {
		System.out.println("���� ���� ���� ����� �Դϴ�.");
	}
	}
}

			
			
	