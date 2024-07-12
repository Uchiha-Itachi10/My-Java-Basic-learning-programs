import java.util.Scanner;
public class GradeCalculator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks: ");
        int marks = sc.nextInt();
        sc.nextLine();
        
        if (marks < 0 || marks > 100){
            System.out.println("You have entered a invalid number. Please try again!!");
        }else{
        
        if (marks >= 90 && marks <= 100){
            System.out.println("A grade");
       } else if (marks >= 80 && marks < 90){
            System.out.println("B grade");
       } else if(marks >= 70 && marks < 80){
            System.out.println("C grade");
       } else if (marks >= 60 && marks < 70){
           System.out.println("D grade");
       } else {
           System.out.println("Fail");
       }
     }
       
       sc.close();
    }
}
