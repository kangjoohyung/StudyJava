package SelfStudy.ss221003;
/**
 * 변수 관련된 예제
 * char(문자,''), String(문장,""), int(정수), double(소수)
 * 변수는 사용하기 전 선언해야한다, 초기화도 미리 동시에 하는 것이 좋다.
 * 변수 명은 숫자로 시작할 수 없고, 문자나 $,_로 시작한다. 
 * 첫글자는 소문자로 보통 켐멜표기법으로 작성한다.  
 * 자바 예약어는 사용할 수 없다.
 * 원시 타입 변수는 8가지가 있다.
 * 
 * 예제 : 
 * 아래에서 8가지 원시타입 변수+String 변수 구현
 * 초기화 없이 선언시 기본값들
 * @author Buck
 *
 */
class Ex03PrimativeVar{
	public static void main(String[] args){
		byte byte01 = 1; //1byte 메모리 사용(8bit) 
		byte byte01e; //초기화 없이 선언만 할 경우 기본값들 확인
		char char02 = 'A'; // \'\'로 사용2byte 메모리 사용(16bit), 유니코드로 저장됨, 숫자로 저장되서 크기비교로 정렬가능
		char char02b=65; //'A'에 해당하는 값이 65이므로, 65로 입력해도 동일하게 출력된다.
		char char02e; //
		short short03= 2; //2byte 사용
		short short03e;
		int int04 = 4; //4byte사용(32bit), 정수에서 기본적으로 사용함
		int int04e;
		long long05=8; //8byte사용(64bit), 뒤의 캐스팅이라고 불리는 변환에 유의해서 사용하게됨 
		long long05e;
		float float06=4; //4.0 출력, 4byte사용, 실수(소수로 표현됨)
		float float06e;
		double double07=8; //8.0 출력, 8byte사용, 실수(소수)에서 기본적으로 사용함
		double double07e;
		boolean boolean08=true; //1byte사용, true와 false 두 개의 값만 허용
		boolean boolean08e; //기본값 true로 유일하게 사용 가능
		
		String string11  = "A";//String 변수, 문장을 표현-글자를 표현하는 char와는 다름, 숫자값이 아닌 객체에 저장되어 비교하려면 다른 함수 필요
		String string11e;
		
		System.out.println("문장 출력시 직접 큰따옴표로 사용가능, 변수 출력시 변수 이름만 넣으면 됨");
		System.out.println("byte01="+byte01+" byte01e=사용불가능"+" char02="+char02+" char02e=사용불가능"+"\n "
				+ " short03="+short03+" short03e=사용불가능"+" int04="+int04+" int04e=사용불가능"+"\n"
				+" long05="+long05+" long05e=사용불가능"+" float06="+float06+" float06e=사용불가능"+"\n"
				+" double07="+double07+" double07e=사용불가능"+" boolean08="+boolean08+" boolean08e="+boolean08
				+"\n"+"string11="+string11+" /string11e=사용불가능"+"/char02b="+char02b);
		System.out.println("출력결과 초기화 반드시 필요하며, 원시타입중 유일하게 boolean만 true기본값이 있다. "
				+ "실수타입은 정수로 입력해도 소수로 표시된다.\n char는 숫자로 입력해도 글자가 나온다. 즉 원시타입 변수는 숫자로 입력된 값들이다.");
	}
}