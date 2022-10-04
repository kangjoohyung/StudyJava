package SelfStudy.ss221004;
class ex03CastingExam{
	public static void main(String []args){
		byte b1;
		byte b2,b3; 
		int i1=7;
		System.out.println("int i1="+i1);

		b1=(byte)i1 ;//int를 byte로 담을수없다 
		System.out.println("byte b1="+b1);

		b2=20;
		System.out.println("byte b2="+b2);
		
	   	b3=(byte)(b2+b1);//byte끼리연산하면int로 변환
	

		System.out.println("byte b3="+b3);
		
		long lo=56897L;
		System.out.println("long lo="+lo);

		int i4=(int)(lo+i1); 
		System.out.println("int i4="+i4);
		
		boolean boo;
		 boo=false;//bolean형애는 true false만가능 
		
		System.out.println("boolean boo="+boo);

		double d=4.67e-3;
		System.out.println("double d="+d);

		float f1=lo;//정수형은 실수형보다 공간을 적게본다(정수형long을 float에 저장가능)
		System.out.println("float f1="+f1);
				
		
	    float f2=(float)d;
		System.out.println("float f2="+f2);

		char c1,c2, c3;
		c1='\u0167';//문자형은 유니코드지원
		System.out.println("char c1="+c1);

		 b2=(byte)c1; 
		System.out.println("byte b2="+b2);
		
		c2='A';
		System.out.println("char c2="+c2);
		
		b2=(byte)c1;
		System.out.println("byte b2="+b2);
		
		c3=(char)(c2+2);
		System.out.println("char c3="+c3);
	}

}