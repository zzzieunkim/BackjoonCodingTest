import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int year1 = sc.nextInt(); // 불기 입력일
		int year2 = 544; // 불기 기준년
 		
		int result = year1 - (year2-1); // 불기 - (불기 기준년 -1);
		// 년도를 계산할 때는 -1을 해줘야한다. 
		System.out.println(result);
	}

}
