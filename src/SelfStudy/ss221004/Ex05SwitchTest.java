package SelfStudy.ss221004;
class Ex05SwitchTest {
    public static void main (String []args){
        int no=(int)(Math.random()*10)+1;
        String str;
        switch(no){
	        case 1 : str="일욜";break; 
	        case 2 : str="월욜";break; 
	        case 3 : str="화욜";break; 
	        case 4 : str="수욜";break; 
	        case 5 : str="목욜";break; 
	        case 6 : str="금욜";break; 
	        default:str="일욜";
        }
        System.out.println(no+"는"+ str + "입니다");     
    }
}
