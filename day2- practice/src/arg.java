import java.util.Scanner;

public class arg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int count=0,n=0;
		double sum=0;
		
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���.");
		while((n=sc.nextInt()) !=0)
			sum=sum+n;
			count++;
			System.out.println("���� ������ "+count+"���̸� ����� "+sum/count+"�Դϴ�");
	}
	}
		
		


