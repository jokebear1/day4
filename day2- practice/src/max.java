import java.util.Scanner;

public class max {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		int max=0	;	
		System.out.println("��� 5���� �Է��ϼ���.");
		
		for(int i=0; i<5; i++) {
			a[i]=sc.nextInt();
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("���� ū ���� "+max+"�Դϴ�.");
		
	}

}
