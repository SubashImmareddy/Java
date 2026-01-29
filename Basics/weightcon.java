import java.util.Scanner;
public class weightcon {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newweight;
        int choice;

        System.out.println("Welcome to weight Conversion");
        System.out.println("1: lbs to kgs\n2: kgs to lbs");
        System.out.print("Please Enter your Choice: ");

        choice = scanner.nextInt();
         if(choice==1){
             System.out.print("Enter the weight in lbs: ");
             weight=scanner.nextDouble();
             newweight=weight*0.453592;
             System.out.printf("The converted weight %.2f in kgs",newweight);
         }
         else if(choice==2){
             System.out.print("Enter the weight in kgs: ");
             weight=scanner.nextDouble();
             newweight=weight*2.20462;
             System.out.printf("The converted weight %.2f in lbs",newweight);

         }
         else{
             System.out.print("Invalid choice!");
         }



        scanner.close();
    }
}
