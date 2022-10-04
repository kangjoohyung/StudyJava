package SelfStudy.ss221004;
import java.util.Scanner;

/**
    java.util.Scanner 는 사용자로 부터 키보드 입력을 타입별로 받을수 있도록 다양한 메소드를 제공한다.
	 1) 숫자를 입력받을때
	      int i = 변수이름.nextLine(); // 개행문자(\n)무시 된다.

     2) 문자를 입력받을때
	    String date = 변수이름.next(); // 공백없는 입력값 , 개행문자(\n)무시

	 3) 문자열(공백포함) 입력받을때
	    String date = 변수이름.nextLine();// 공백을 포함 문자열

*/
public class Ex07ScannerExam{ 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수는 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수는 : ");
		int eng = sc.nextInt();
		System.out.print("이름은 : ");
		String name = sc.nextLine();
		System.out.println("-------------");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("이름 : " + name);
	}
}
