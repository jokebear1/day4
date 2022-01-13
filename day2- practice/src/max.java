import java.util.Scanner;

public class max {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		int max=0	;	
		System.out.println("양수 5개를 입력하세요.");
		
		for(int i=0; i<5; i++) {
			a[i]=sc.nextInt();
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("가장 큰 수는 "+max+"입니다.");
		
	}

}
