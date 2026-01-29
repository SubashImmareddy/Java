import java.util.Scanner;
public class c2f {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newtemp;
        String unit;

        System.out.print("Enter the Temperature: ");
        temp=scanner.nextDouble();

        System.out.print("convert to Celcius or Farenheit (C or F):");
        unit=scanner.next().toUpperCase();

        newtemp = (unit.equals("C")) ? (temp -32)*5/9 : (temp*9/5);

        System.out.printf("The Converted temp is %.2f°%s",newtemp,unit);

        scanner.close();
    }
}
