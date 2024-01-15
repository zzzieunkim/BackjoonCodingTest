import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		String num2 = sc.next();
		
		System.out.println(num1 * (num2.charAt(2)-'0')); 
		// num2는 글자로 받아왔기때문에 숫자로 전환시켜주는 과정이 필요하다.
		// charat이 숫자로 변환시켜주는데 charat만 사용하면 아스키코드 값이 나와서 51이 나온다.
		// 이를 우리가 인식하는 숫자로 변환시키려면 (charat() -'0')까지 붙어야 숫자가 제대로 출력된다. 
		System.out.println(num1 * (num2.charAt(1)-'0'));
		System.out.println(num1 * (num2.charAt(0)-'0'));
		System.out.println(num1 * Integer.parseInt(num2));
		// integer.parseint는 글자를 숫자로 바꿔준다.
	}

}