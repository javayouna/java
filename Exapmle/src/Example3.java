import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
	
	/*
	 ���빮��3
	 ����ڰ� �ش� ���� �Է��մϴ�.
	 ��, ����� �� ���� ���ڸ� �Է��ϵ� 
	 ù�� ° ���ڿ� �ι� ° ���� ����
	 �ȿ� �ִ� ��� ���ڸ� ���ؼ� ������� �������� �����ϼ���.
	 ��, �ش� �ڵ�� do~while ������ �ۼ�
	 
	 ����;
	 ù ��° ���� ���ڴ�? 5
	 �� ��° ���� ���ڴ�? 10
	 ���� ���� ��� �հ��: 45�Դϴ�.
	 */
	
   /*Scanner tt = new Scanner(System.in);
	System.out.println("ù ��° ���ڸ� �Է����ּ���.");
	int user1 = tt.nextInt();
	
	Scanner tt2 = new Scanner(System.in);
	System.out.println("�� ��° ���ڸ� �Է����ּ���.");
	int user2 = tt2.nextInt();
	int total = 0;
	
	 	do {
	 		total=total+user1+user2;
	 		user1++;
	 	}
	 	while(user1<=user2);
	System.out.println("���� ���� ��� �հ�� :"+total+"�Դϴ�.");
	
	tt.close();
	tt2.close(); */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���� ���ڴ�?");
		int a = sc.nextInt();
		System.out.println("�� ��° ���� ���ڴ�?");
	    int b = sc.nextInt();
	    int total =0;
	    do {
	    	total=total+a;
	    	a++;
	    }
	    while(a<=b);
	    System.out.println("���� ���� ��� �հ�� "+total+"�Դϴ�.");
	    sc.close();
	    
	
	
	
	
	}

}
