import java.util.Scanner;
public class trihypo {
    public static void main (String[] args){

        Scanner scanner =new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of A: ");
        a=scanner.nextDouble();
        System.out.print("Enter the length of B: ");
        b=scanner.nextDouble();
        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.print("The Length of C is: "+c+" cm");

        scanner.close();
    }


}
