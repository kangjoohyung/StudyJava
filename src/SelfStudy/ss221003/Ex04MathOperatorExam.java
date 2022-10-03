package SelfStudy.ss221003;
/**
 * 산술연산자 예제이다.
 * 
 * 연산 우선순위는 사칙연산과 비슷하며
 * %가 나머지값을 구하는 연산기호이다.
 * 우선 기본적인 int변수로 나타낸다.
 * +나 = 등호는 변수끼리의 관계연산자로도 사용,
 * 산술연산자에서는 =대신 ==로 표현, +=면 오른쪽값을 왼쪽에 더하면서 대입, -=, ++등등이 있다.
 * ++i면 증가한 후에 대입, i++면 대입한후에 오른쪽에 증가...차이가 있는 연산자이다.
 * 
 * 연산자에는 우선순위가 있는데...너무많아서 우선 아래것만 정리했다.
 * @author Buck
 *
 */
class Ex04MathOperatorExam{
	public static void main(String []args){
		int i=5;
		int j=2;
		System.out.println("i+j="+i+j);//연산자우선순위
		System.out.println("i-j="+(i-j));//3
		System.out.println("i*j="+(i*j));//10
		System.out.println("i/j="+(i/j));//2
		System.out.println("i%j="+(i%j));//1

		System.out.println("i="+i);//5
		
		int k=i++;//선대입 후증가
		System.out.println("k="+k);//5
		System.out.println("i="+i);//5
		
		int p=++i;//선증가 후대입
		System.out.println("p="+p);//7
		System.out.println("i="+i);//7

		int x=19 + 4 * 3 / 2 - 10 * 2 + 4; // 19+6-20+4

		System.out.println("19+4*3/2-10*2+4="+x);//9
	}	
}