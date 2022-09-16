package SmartProgramming;
import java.util.Scanner;
public class Table
{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the table you want : ");
//        int t = sc.nextInt();
////        int t = 2;
//        for(int i = 1; i <= 10 ; i++){
//            System.out.println(  +t+ " X " +i+ " = " +(t*i));
//        }
        int number = 7 , factorial = 1;
//        for( int i = 1 ; i <= number ; i++) //increment
        
        
        for (int i = number; i>=1;i--) //decrement method

        {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
