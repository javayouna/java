import java.util.Scanner;

public class Homework2 {
	/*
	 * ����ڰ� �Է��� ���ڿ� ���缭 �������� �۵��Ǹ�, ������ ����Ͽ� ¦������ Ȧ������ ����ϼ���. 
	 * "������ ���ڸ� �Է��ϼ���?"��� �޼�����
	 * ��µǸ� �ش� ���ڿ� ���缭 ��� ����� ���ϸ�, ���� ���� ���� ¦������ Ȧ�������� ����Ͻø� �˴ϴ�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = "������ ���ڸ� �Է��ϼ���.";
		String msg2; //�޼��� �κ�
		System.out.println(msg);
		int user = sc.nextInt();
		int f = 1;
		int total = 0; // �� ���ؾ��ؼ� 1�ƴϰ� 0������
		do {
			total = total + (user * f);
			f++;
		} while (f < 10);
	//System.out.println(total); �հ質��
		if(total%2==0) {
			msg2="¦��";
		}
		else {
			msg2="Ȧ��";
		}
		System.out.println("������� "+msg2+" �Դϴ�.");
	 
	
	
	
	}
}
