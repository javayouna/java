
public class App {

	public static void main(String[] args) {
		// �ջ� ������ �� ���� ���� ����Ͻʽÿ�.

		int a = 25 + 31 * 4 + 12;
		int b = 15 * 3 + 9 + 14;

		if (a < b) {
			System.out.println("a�� b���� �۽��ϴ�");
		}

		else {
			System.out.println("b�� a���� �۽��ϴ�");
		}
	
	/* �ش簪�� 2������ ¦��, Ȧ�� Ȯ���ϱ� */

	int c = b % 2; // % ���� 0 �Ǵ� 1�� ������ �� ���
	if(c==0) {
	System.out.println("¦�� �Դϴ�.");
	}
	
	else {
		System.out.println("Ȧ�� �Դϴ�.");
	}
	}
}

