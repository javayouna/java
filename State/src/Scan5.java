import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
/*	byte a = 10;
		if(a < 10) {
			System.out.println("�Է��� ���� 10�̻� ���ڸ� �Է��ϼ���.");
		}
		else if (a>=10||a<=22) { //���ǹ��� ������ ����,����
			System.out.println("��÷ �Դϴ�");
		}
		else {
			System.out.println("���� ���� ���� �Դϴ�.");
		}*/

		
		Scanner a = new Scanner(System.in);
		
			System.out.println("Q.1~45���� ���� �ϳ��� �Է��ϼ���.");
			int d = a.nextInt();
			if (d ==0) {
				System.out.println("���� �Է��� �߸� �Ǿ����ϴ�.");}
		       	else if (d>45) {
					System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");
					}
					else {
					 if(d==7||d==12||d==14) {
						System.out.println("��÷ �Դϴ�.");	}
						else {
							System.out.println("������ȸ��..");
						}
					}
	//���빮��
	//Q. 1~45���� ���� �ϳ��� �Է��ϼ���.
	//0=�����Է��� �߸� �Ǿ����ϴ�.
	//45���� ū ����:���ڴ� 1~45������ �Է� �����մϴ�.
	

	

	


