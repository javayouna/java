
public class lf_for {

	public static void main(String[] args) {
		final int a = 1; 
		//final�� ���� ����>����� ���� 
		//* ���: ���� ������ �ʴ� ��
		

		final int ct=5;      //������ 
		int f;				//�ݺ���
		boolean ok = false;		//���ǿ� ���� true, false; 
		for(f=1;f<11;f++) {
			if(f==ct) {//�ݺ��� ���� �������� ���� ��� 
			//	System.out.println("��ϵ� ���� Ȯ�� �˴ϴ�.");
				ok=true; //���ǿ� ���� ���� �����մϴ�. 
			}
			
			}
		
			if(ok==false) { 
				//���࿡ �ݺ����� �����µ��� �ݺ��� �ȿ� ���� ������ ���� ��� 
				//��µǴ� �ڵ� �Դϴ�.
			//System.out.println("Ȯ���� ���� �ʴ� ���� �Դϴ�.");
		}
	// �� 20���� ���� �ݺ��մϴ�. �� �� Ȧ������ ����ϵ��� �մϴ�. 
	 
			int ff; 
			String odd=""; //oddȦ�� even¦��
			
			for(ff=1;ff<21;ff++) {
				
				if(ff % 2 != 1) {
				System.out.print(ff+" ");
				}
			
			
				else { 
					//���࿡ Ȧ�� ���� ��� odd ������ ���������� ���� �߰��ϰ� �˴ϴ�.
					odd += ff + " "; //�߰� �� ��� " " ������� Ȱ���Ͽ� ������
					
				}
					
				}
			
			System.out.println(odd);
			
			
	}
	

}
