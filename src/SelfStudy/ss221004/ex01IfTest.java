package SelfStudy.ss221004;
class IfTest{
    public static void main(String [] args){
        //선언된변의 값 짝수 짝수입니다
		int b =7;
		if(b%2==0){System.out.println(b+"는 짝수입니다");
		}else{System.out.println(b+"는 홀수입니다");
		}
		System.out.println("------------");
		//난수발생
		double nansu =Math.random();
		//1에서5사이정수 난수발생
		System.out.println("nansu =" + nansu);
		int convertNo =(int)(nansu *5) + 1;
    }//메인끝
}//클래스끝