import java.util.Scanner;

public class Tes1 {

	public static void main(String[] args) {
	/*
	  ���� ����

����ڰ� �Է��Ͽ� ���ǿ� �´� �޼����� ����Ͻÿ�.
ù ��° ���� ���� �Է��ϼ��� 
      2 .  �� ��° ���� ���� �Է��ϼ���.

 ù ��° ���� ��*�� ��° ���� �� ��� ���
 ��, �ش� ������� 100 ���ϸ� -> ��100������ ����� �Դϴ�.��
100 �̻��̸� ->���ش� ���� 100�̻� ����� �Դϴ�.��

������ �ݺ���->���ù�(����)->�ݺ�+����/ �ݺ�+����/ �ݺ�+����+����->

	 */

		Scanner ww = new Scanner(System.in);
		System.out.println("ù ��° ���� ���� �Է��ϼ���.");
		int user1 =ww.nextInt();
		
		Scanner ee = new Scanner(System.in);
		System.out.println("�� ��° ���� ���� �Է��ϼ���");
		int user2 =ee.nextInt();
		
		
		int user3=user1*user2;
			if(user3<=100) {
			System.out.println("100������ ����� �Դϴ�.");
		}
			else{
			System.out.println("�ش� ���� 100�̻� ����� �Դϴ�.");
		}
		
	ww.close();
	ee.close();

	}

}
