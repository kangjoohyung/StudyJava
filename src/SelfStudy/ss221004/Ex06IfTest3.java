package SelfStudy.ss221004;
public class Ex06IfTest3 {
    public static void main(String args[]){
        int no=(int)(Math.random()*12)+1;
        if(no ==2){
        	System.out.println("28일");
        }else if (no==4 || no==6 ||no==9 ||no==11){
        	System.out.println("30일");  
        }else System.out.println("31일");
    }
}
