
public class For_plus {

	public static void main(String[] args) {
		/*1~10���� ��� ���ڸ� ���� ������� ����Ͻÿ�. */
		int f;
		int total=0;
		for(f=1;f<11;f++) { //total�������� �ݺ����� ���������� ������Ŵ 
			//total = total +f; 
		total+=f;
		}
		//System.out.println("���հ�:"+total);
		
		//+=(���ϱ��Ҵ�) -=(�����Ҵ�) *=(���ϱ��Ҵ�) /=(�������Ҵ�)
		//b=b-f; -> b-=f;
		
		/*
		 ���빮��
		 ��ü���� 500�� �ֽ��ϴ�. �� 8ȸ ���� �ݺ��Ǹ鼭 
		 �ѹ� �ݺ� �� ������ 12�� �����ϵ��� �Ͽ� �������� ����ϼ���.
		 */
		int a;
		int b=12;
		for(a=500;a>9;a--) {
			total=500-b-a;
		}
	//System.out.println("������:"+total);
		int alls =500;
		int m=12;
		int w;
		for(w=1;w<9;w++) {
			alls=alls-m;
		}
			System.out.println(alls);
		}
	}
	
	


