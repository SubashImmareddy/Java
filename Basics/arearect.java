import java.util.Scanner;

public class arearect {
    public static void main(String[] args){
        double h = 0;
        double w = 0;
        double area=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height:");
        h = scanner.nextDouble();

        System.out.print("Enter the Width:");
        w = scanner.nextDouble();

        area = h*w;

        System.out.print("The Area of Rectangle is:"+area+"cm²");

        scanner.close();


    }
}
