import java.util.Scanner;

public class Test2 {
/*
 * ���빮�� - ���ǹ�
���� �ڽ��� ���忡�� ��,����� �Ǵ� ���μ��� �����ؾ��Ѵ�.
���� �⺻ �ڻ�:100,000��
��1�� �Է½� �Ա�, 2�� �Է½� ����Դϴ�.�� ������ ���� ���� ���� �Ǿ�� ��

1�� press-���ش� �ݾ��� �Է��ϼ��䡱
����ڰ� �Է��� �ݾ� + �⺻ �ڻ� �ݾ�
�� �ڻ�ݾ� ����ϸ� ��
ex 3,000�� �Է½� 3,000+100,000 �� 103,000��

2�� press-������� �ݾ��� �Է��ϼ��䡱
����ڰ� �Է��� �ݾ�-�⺻ �ڻ�ݾ� 
�� �ڻ�ݾ� ����ϸ� ��

 * 
 * 
 */
	public static void main(String[] args) {
		Scanner aa = new Scanner(System.in);
		System.out.println("1�� �Է½� �Ա�, 2�� �Է½� ����Դϴ�.");
		int ee = aa.nextInt();
		int gg = 100000;
		int sum;
		
			if (ee == 1) {
				System.out.println("�Ա��� �ݾ��� �Է��ϼ���.");
				int mm = aa.nextInt();
				sum = gg + mm;
				System.out.println("�� " + sum + " ��");
	
				}
			else if (ee == 2) {
				System.out.println("����� �ݾ��� �Է��ϼ���.");
				int mm = aa.nextInt();
				sum = gg - mm;
				System.out.println("�� " + sum + " ��");
				}
			else {
				System.out.println("�������� �ڵ尡 �ƴմϴ�.");
				aa.close();
				}
	

	}

}
