import java.util.Scanner;
public class switchenh {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of week: ");
        String day = scanner.nextLine();

        switch(day){
            case "Monday","tuesday","wednesday","Thursday","Friday" ->
                System.out.println("This is week day");
            case "Saturday","Sunday" ->
                System.out.println("It is weekend");
            default -> System.out.println(day+" is not a day! ");
        }


        scanner.close();
    }
}
