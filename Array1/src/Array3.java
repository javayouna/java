import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {

		/*
		 * int num[] = {5,10,15,20,25,30,35}; /*for each���� ��� �� ���� �ε��� ��ȣ �ʿ���� ��� �� ���
		 * -> �ܼ��� �迭�� �� for~do~while�� ��� �� ���� �ε��� ��ȣ �ʿ� �� �� ��� -> ������ �迭�� �� �ε��� ��ȣ:
		 * [0][1][2]
		 * 
		 * for(int f:num) { //int f�� ���������� data�迭���� �޾Ƽ� �����ŵ�ϴ�. if(f%2==0)
		 * System.out.println(f); }
		 */

	/*	String pay[] = { "�������Ա�", "�ſ�ī��", "�޴���", "��ǰ��", "����" };
		Scanner sc = new Scanner(System.in);
	//	System.out.println("���� ���¸� �������ּ���");
		String pm = sc.next();
		for (String z : pay) { // �ڹ迭 �����Ͱ� �����̹Ƿ� �޴� ���� ���� ���� ������ ����ؾ� ��
			if (pm.equals(z)) {
				if (z.equals("�޴���")) {
					//System.out.println("���� �ý��� �������� �ش� ������ ��� �Ͻ� �� �����ϴ�.");

				} else {
					//System.out.println(pm + "�� ���� ���� �˴ϴ�.");
				}

				// System.out.println(pm+"�� ���� ����˴ϴ�.");
			}
		}
		sc.close();*/
		
/* ���빮�� 
 * {"�ܹ���", "����", "ġŲ", "Ŀ��"}
 * "�ֹ��ϰ��� �ϴ� ������ �������ּ���."
 * �ش� ������ ��4���� ��� 
 * ��, "�ֹ�����"��� ����ڰ� �Է½� �� ��� �ֹ��� ����Ǹ�,
 * �ֹ������� ����Ͻø� �˴ϴ�. 
 */
	 String food[]= {"�ܹ���", "����", "ġŲ", "Ŀ��"};
		
		String msg = "�ֹ��ϰ��� �ϴ� ������ �������ּ���. �ܹ���,����,ġŲ,Ŀ��";
		Scanner uu =new Scanner(System.in);
		int sum=0;
		for(int i=1;i<5;i++) {
			System.out.println(msg);
			String user=uu.next();
			sum=user[i]+sum;
	
		}
	
		System.out.println("�ֹ��� ����Ǿ����ϴ�. �ֹ�������" + sum + "�Դϴ�");

		uu.close();
		
	}

}