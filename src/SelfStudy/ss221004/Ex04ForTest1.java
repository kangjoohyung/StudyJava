package SelfStudy.ss221004;
import java.util.zip.ZipEntry;

public class Ex04ForTest1 {
    public static void main(String args[]){
        /*1-100까지 한줄
        1-100까지 한줄 5배수
        1-100 합
        a-z한줄
        1-100 10행 10줄
        1-100 3배수합
        100-1꺼구로 출력
        */
        int sum =0;
        for(int i=1; i<=100; i++){
            sum=sum+i;
        }
        System.out.println("1-100합"+ sum);
        for(int i=3; i<=100;i++){
            sum=sum+i;
        }
System.out.println("3배수합"+sum);
    }
    
}
