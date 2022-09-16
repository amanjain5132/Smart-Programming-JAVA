package SmartProgramming;
import java.util.Scanner;
public class Table
{
    public static void main(String table []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the table you want : ");
        int t = sc.nextInt();
//        int t = 2;
        for(int i = 1; i <= 10 ; i++){
            System.out.println(  +t+ " X " +i+ " = " +(t*i));
        }
    }
}
