package SelfStudy.ss221003;
/**
 * 논리연산자 예제이다.
 * 
 * !이면 반대, &,&&이면 and, |,||이면 or
 * &,&&차이는 자바 작동방식에서 차이가 있는데, 한번도는지 두번도는지 차이이다. 
 * 보통 2개짜리를 많이 쓴다.
 * 
 * 비교연산자인 ==,!=,>,>= 등등이 있으며, boolean값으로 출력된다.
 * 
 * @author Buck
 *
 */
class Ex05BooleanOPeratorExam{
	public static void main(String args[]){
		boolean t=true ;
		boolean f=false;
		System.out.println("true&false="+(t&f));//t
		System.out.println("true&true="+(t&t));//t
		System.out.println("false&false="+(f&f));//f
		System.out.println();
	
		System.out.println("true|false="+(t|f));//t
		System.out.println("true|true="+(t|t));//t
		System.out.println("false|false="+(f|f));//f
		System.out.println();

		System.out.println("true^false="+(t^f));//t
		System.out.println("true^true="+(t^t));//f
		System.out.println("true^false="+(t^f));//t
		System.out.println("true^true="+(t^t));//f
		System.out.println();

		System.out.println("true&&false="+(t&&f));//f
		System.out.println("true&&true="+(t&&t));//t
		System.out.println("true&&false="+(t&&f));//f
		System.out.println("false&&false="+(f&&f));//t
		System.out.println();

		System.out.println("true||false="+(t||f));//t
		System.out.println("true||true="+(t||t));//t
		System.out.println("false||false="+(f||f));//f
		System.out.println();

		int i=5; int j=3;
		System.out.println("int i="+i+"\tint j="+j);
		System.out.println("i>=j==>>"+(i>=j));
		System.out.println("i>j=>>"+(i>j));
		System.out.println("i<=j=>>"+(i<=j));
		System.out.println("i<j=>>"+(i<j));
		System.out.println("i==j=>>"+(i==j));
		System.out.println("i!=j=>>"+(i != j));
		System.out.println(true|test()); //or이여서 두개가 다 출력되었다.
	}
	public static boolean test(){
		System.out.println("cnffur");
		return false;
	}
}