import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/* ���빮��8
		 * ����� �н������ a1234�Դϴ�.
		 * ����ڰ� �н����带 �Է��մϴ�. ��, 3ȸ �̻� ���н� ������ ���� ��� �ǵ��� �մϴ�.
		 * "�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�."
		 * ��, �н����尡 ���� ��� "�α��� �Ǿ����ϴ�." ��� ��� �Ǿ���մϴ�.
		 */

		
	/*	Scanner nn = new Scanner(System.in);
		System.out.println("��й�ȣ�� �Է��ϼ���");
		String ww= nn.next();
		int aa=1;
		for(aa=1;aa<3;aa++) {
			System.out.println("��й�ȣ�� �Է��ϼ���");
		
			if(ww.equals("a1234"))
		{
			System.out.println("�α��� �Ǿ����ϴ�.");
		}
				
			else {
				System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
			} 
	}
	*/
		//break�� �ݺ����� ���� �����Ҷ� ����մϴ�.	
			
		 
		final String pw = "a1234";
		int c =3;
		Scanner sc = new Scanner(System.in);
		int w = 1;
		String msg = "��й�ȣ�� �Է��ϼ���.";
		while(w<4){
			System.out.println(msg);
			String userpw = sc.next();
			if(pw.equals(userpw)){
			System.out.println("�α��� �Ǿ����ϴ�.");
			break;
		}
			else {
				msg="�ùٸ� �н����带 �Է��ּ���.";
				c--;
				if(c==0) {
				System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
			}
			
			w++;
		}
		}
		sc.close();
		
		
		
		
		
		
		
		}
		
		}

