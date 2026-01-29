import java.util.Scanner;
public class compinte{
    public static void main (String[] args){
     Scanner scanner = new Scanner(System.in);
     double principal;
     double rate;
     int years;
     int timesCompounded;
     double amount;
     System.out.print("Enter the principal amount: ");
     principal = scanner.nextDouble();

     System.out.print("Enter the intrest rate: ");
     rate = scanner.nextDouble() /100;

     System.out.print("Enter the no of time compounded per year:: ");
     timesCompounded = scanner.nextInt();

     System.out.print("Enter the no of Years: ");
     years = scanner.nextInt();

     amount = principal*Math.pow(1+ rate/timesCompounded,timesCompounded*years);

     System.out.print("The amount after "+years+" $"+amount);




     scanner.close();
    }

}