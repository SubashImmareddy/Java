import java.util.Random;
import java.util.Scanner;
public class numberguess {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min=1;
        int max=100;
        int randomnumber = random.nextInt(min,max+1);

        System.out.println("Welcome to Number Guesing Game");
        System.out.printf("Guess a number between %d - %d\n",min,max);

        do{
            System.out.println("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;
            if(guess<randomnumber){
                System.out.println("TOO LOW! Try again! ");
            }
            else if(guess>randomnumber){
                System.out.println("TOO HIGH! Try again! ");
            }
            else{
                System.out.println("Congartsss!!");
                System.out.println("The number was "+randomnumber+".");
                System.out.println("you took "+attempts+" attemps.");
            }

        }while(guess != randomnumber);


        scanner.close();
    }
}
