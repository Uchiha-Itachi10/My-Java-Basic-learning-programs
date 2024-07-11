import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        double firstnum = sc.nextDouble();
        System.out.println("Enter Second number: ");
        double secondnum = sc.nextDouble();
        
        sc.nextLine();
        
        System.out.println("Enter the operation you want to perform");
        String operation = sc.nextLine();
        
        if(operation.equals("sum")){
            System.out.printf("%.1f + %.1f = %.1f", firstnum, secondnum, firstnum + secondnum);
        }else if(operation.equals("sub")){
            System.out.printf("%.1f - %.1f = %.1f", firstnum, secondnum, firstnum - secondnum);
        }else if(operation.equals("mul")){
            System.out.printf("%.1f x %f = %.1f", firstnum, secondnum, firstnum * secondnum);
        }else if(operation.equals("div")){
            System.out.printf("%.1f / %.1f = %.1f", firstnum, secondnum, firstnum / secondnum);
        }else{
            System.out.println("operation can't be performed");
        }
        sc.close();
    }
}
