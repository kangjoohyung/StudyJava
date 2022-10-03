package SelfStudy.ss221003;
/**
 * 변수 관련된 예제
 * char(문자,''), String(문장,""), int(정수), double(소수)
 * 변수는 사용하기 전 선언해야한다, 초기화도 미리 동시에 하는 것이 좋다.
 * 변수 명은 숫자로 시작할 수 없고, 문자나 $,_로 시작한다. 
 * 첫글자는 소문자로 보통 켐멜표기법으로 작성한다.  
 * 자바 예약어는 사용할 수 없다.
 * 원시 타입 변수는 8가지가 있다. 
 * @author Buck
 *
 */
class Ex03PrimativeVar{
	public static void main(String[] args){
		byte byte01 = 0;
		char charValue = 'A';
		String strValue  = "A";
		int intValue = 10;
		double doubleValue = 5.7;
		double var = (double) intValue;
		double var2 = 10;
		//char var= (char) strValue;
		System.out.println(var2);
		System.out.println("Hello java");
		System.out.println("안녕하세요");
	}
}