import java.util.Scanner;

public class Homework1 {
	/*
����ڰ� �Է��� ���ڿ� ���缭 �������� �۵��Ǹ�,
		 ������ ����Ͽ� ¦������ Ȧ������ ����ϼ���.
		 "������ ���ڸ� �Է��ϼ���?"��� �޼����� ��µǸ� 
		 �ش� ���ڿ� ���缭 ��� ����� ���ϸ�,
		 ���� ���� ���� ¦������ Ȧ�������� ����Ͻø� �˴ϴ�.
 */
	public static void main(String[] args) {
		Scanner gugu = new Scanner(System.in);
		System.out.println("������ ���ڸ� �Է��ϼ���~");
		int i = gugu.nextInt();
		int e = 1;
		int sum;
		int total=0;

		for (e = 1; e < 9; e++) {
			sum = e * i;
			total = total + sum;
			}

			if (total % 2 == 0) {
			System.out.println("¦���Դϴ�.");
			}

			else if (total % 2 == 1) {
			System.out.println("Ȧ���Դϴ�.");
			}

	}

}
