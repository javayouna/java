import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * 
		 * A�л��� ���� ������ �Է� �ް� ��������� ������ ���α׷��� �����մϴ�. "������ �Է��ϼ���!" ��� ������ �� 5���� ������ �Ǹ�, ���
		 * ������ �ջ��Ͽ� ����մϴ�.
		 *
		 * [�߰���ȹ] "�Է��Ͻ� ���� ���� �����ּ���:"��� ���ϸ��� ��� �� �ش� ���� �� ��ŭ �ݺ����� ���� �Ǹ�,���� �� ��ŭ ��հ��� ����
		 * �Ǿ�� �մϴ�.
		 */

		/*
		 * Scanner bb = new Scanner(System.in);
		 * 
		 * double i = 0; double ii = 0; String msg = "������ �Է��ϼ���";
		 * 
		 * System.out.println("�Է��Ͻ� ������ ���ڸ� �Է����ּ���"); int a = bb.nextInt();
		 * 
		 * do { System.out.println(msg); int usepw = bb.nextInt(); // �����ڵ� String usepw
		 * = bb.next(); ii = ii + usepw; // �����ڵ� ii = ii + i;
		 * 
		 * i++; } while (i < a);
		 * 
		 * System.out.println("�ش� ������ ������ : " + ii / a); if (ii / a >= 40) {
		 * System.out.println("�հ��Դϴ�"); } else { System.out.println("������Դϴ�"); }
		 * 
		 * bb.close();
		 */

		// ������ ��
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��Ͻ� ���� ���� �����ּ���: ");
		int subject =sc.nextInt();
		int w = 1;
		int user;
		int total = 0;
		while (w <=subject) {
			System.out.println("������ �Է��� �ּ���: ");
			user = sc.nextInt();
			total = total + user;
			w++;
		}
		int avg = total /subject; // double avg=(double)(total)/subject; �̷��� �ϸ� �Ҽ� ������ �� ���� 
		String msg;
		if (avg < 40) {
			msg = "������Դϴ�.";
		} else {
			msg = "�հ��Դϴ�.";
		}

		System.out.println("���� ��� ������ " + avg + "�̸�," + msg);

		sc.close();
	
	
	
	}

}
