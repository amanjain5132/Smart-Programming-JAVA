import java.util.Scanner;
public class Calculator
{
    public static void main(String args []) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int A = sc.nextInt();
        System.out.println("Enter Second number");
        int B = sc.nextInt();
        System.out.println("Select the Operation which you want to Procees Further : + , - , * , /");
        String result = sc.next();
        int res ;
        switch(result)
        {
            case "+" : res = A + B;
            System.out.println(res);
            break;
            
            case "-" : res = A - B;
            System.out.println(res);
            break;
            
            case "*" : res = A * B;
            System.out.println(res);
            break;
            
            case "/" : res = A / B;
            System.out.println(res);
            break;
            
            default:
            System.out.println("invalid Selection");
            break;
            
        }
    }
}



import java.util.Scanner;
public class Calculator
{
    public static void main(String args []) 
    {
    String yn;
    do{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First number");
    int A = sc.nextInt();
    System.out.println("Enter Second number");
    int B = sc.nextInt();
    System.out.println("Select the Operation which you want to Procees Further : + , - , * , /");
    String result = sc.next();
    int res ;
    switch(result)
    {
        case "+" : res = A + B;
            System.out.println(res);
            break;

        case "-" : res = A - B;
            System.out.println(res);
            break;

        case "*" : res = A * B;
            System.out.println(res);
            break;

        case "/" : res = A / B;
            System.out.println(res);
            break;

        default:
            System.out.println("invalid Selection");
            break;
    }
    System.out.println("Do you want to Continue if yes then type Y if no then type N");
    yn = sc.next();
}
        while(yn.equals("y")||(yn.equals("Y")));
}
}
