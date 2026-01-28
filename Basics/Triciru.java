import java.util.Scanner;
public class Triciru {
    public static void main (String[] args){
      Scanner scanner = new Scanner(System.in);

      double radius;

        System.out.print("Enter the Radius: ");
        radius= scanner.nextDouble();

        double circumfrence = 2*Math.PI*radius;
        double area = Math.PI*Math.pow(radius,3);
        double volume = (4.0/3.0)*Math.PI*Math.pow(radius,2);

        System.out.println("circumfrence: "+circumfrence);
        System.out.println("Area:" +area);
        System.out.println("Volume: " +volume);
// we can use printf with %.0cm to limit onli one decimal after it
        System.out.printf("Circumfrence: %.1fcm\n ",circumfrence);
        System.out.printf("Area: %.1fcm\n",area);
        System.out.printf("Volume: %.1fcm\n",volume);
      scanner.close();
    }
}
