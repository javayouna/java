
public class if3 {

	public static void main(String[] args) {

		// boolean:true,false�� �����ϰ� �˴ϴ�.
		boolean ck = false;
		if (ck == true) {
			System.out.println("ȸ�������� ���� �˴ϴ�.");
		} else {
			System.out.println("�̿����� �����ϼž߸� ���� �˴ϴ�.");
		}

		String mid = "park";
		String mpass = "a12345";

		// &&:�� ���� ���� �̻� ��� ���� ���
		// ||:�� ���� ���� �̻󿡼� �� ���� ���� ���

		if (mid == "park" && mpass == "a1234") {
			System.out.println("�α��� �ϼ̽��ϴ�.");
		} else {
			System.out.println("���̵� �� �н����带 Ȯ���ϼ���.");
		}

		if (mid == "park" || mid == "kim") {
			//if(mid=="park"||mpass=="a1234") {//�� �����߿� �� ���� ���� ��� �������� �߸��� �ڵ�!
			System.out.println("ȸ���� Ȯ�� �Ǿ����ϴ�.");
		} 
		else {
			System.out.println("Ȯ�ε� ���̵� �����ϴ�.");
		}

		
		
		
		
	}

}
