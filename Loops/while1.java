import java.util.Scanner;

public class while1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String response="";

        while(!response.equals("Q")){
            System.out.println("You are in game");
            System.out.print("To exit the game press 'Q': ");
            response=scanner.nextLine().toUpperCase();
        }

        System.out.println("You exit the Game");

     int age =0;
     do{
         System.out.print("Enter Your age: ");
         age = scanner.nextInt();
     }while(age<0);
      System.out.println("Your age is "+age);


        scanner.close();

    }
}
