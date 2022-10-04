package SelfStudy.ss221004;
class IfTest2{ 
	public static void main(String args[]){//1~10사이의 난수를 발생
		//난수값1 일욜 2 월욜 3 화욜 4 수욜 5목욜 6 금욜 나머지 토욜
		int no =(int)(Math.random()*10)+1;
		char ch='토';
		if(no==1) ch='일';
		else if (no==2) ch='월';
		else if (no==3) ch='화';
		else if (no==4) ch='수';
		else if (no==5) ch='목';
		else if (no==6) ch='금';
		System.out.println(no+"는"+ch+"욜");
	}
}