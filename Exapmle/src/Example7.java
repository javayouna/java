import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/* ���빮��7 
		 ����ڰ� ���� ������ Ȯ���Ͽ� ���� �Է� �� �ش� ����� �����ϴ� ���μ��� ����
		 "ù ��° �Է°� ��(1~10����) �Դϴ�."
		 "�� ��° �Է°� ��(1~10����) �Դϴ�."
		 "�� ��° �Է°� ��(1~10����) �Դϴ�."
		 "������ ���� �Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�" 
		 
		 �ش� �����ȣ�� �°� ������� �����Ͽ� �������� ��½�Ű����.
		 */
		
		/*Scanner ww = new Scanner(System.in);
		System.out.println("ù ��° �Է°� ��(1~10����) �Դϴ�.");
		int user=ww.nextInt();
		System.out.println("�� ��° �Է°� ��(1~10����) �Դϴ�.");
		int user2=ww.nextInt();
		System.out.println("�� ��° �Է°� ��(1~10����) �Դϴ�.");
		int user3=ww.nextInt();
		System.out.println("������ ���� �Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�.");
		int user4=ww.nextInt();
		int sum=0;
	    if(user4==+) {
	    	sum=sum+(user+user2+user3);
	    	System.out.println(sum);}
	    }
	    	if(user4==-) {*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° �Է°� ��(1~10����) �Դϴ�.");
		int no1 =sc.nextInt();
		System.out.println("�� ��° �Է°� ��(1~10����) �Դϴ�.");
		int no2 =sc.nextInt();
		System.out.println("�� ��° �Է°� ��(1~10����) �Դϴ�.");
		int no3 =sc.nextInt();
		System.out.println("�ش� ������ ���� ���� �����ȣ�� �����ÿ�.");
		String ms = sc.next(); //next�� �޾ƾ���
		
		if(ms.equals("+")) {
			System.out.println(no1+no2+no3);
	    }
		
		else if (ms.equals("-")) {
		System.out.println(no1-no2-no3);
		}
		
		else if(ms.equals("*")) {
			System.out.println(no1*no2*no3);
		}
		
		else {
			System.out.println(no1/no2/no3);
		}
	    
		
		sc.close();
	
	}

}
