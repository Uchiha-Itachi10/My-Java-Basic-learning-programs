import java.util.Scanner; 

public class Main{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal amount: ");
        int p = sc.nextInt();
        System.out.println("Enter Interest rate in % : ");
        float i = sc.nextFloat();
        System.out.println("Enter Time period: ");
        int t = sc.nextInt();

        float simpleInterest = (p * i * t) / 100; 
        System.out.println("The Interest is: " + simpleInterest);

        sc.close(); 
    }
}
