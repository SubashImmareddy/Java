import java.util.Scanner;
public class logicalop {
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      //&& = And both true
      //|| = OR one can be true
      //! = NOT inverse of the statement it will do

        String username;

        System.out.print("Enter the username: ");
        username=scanner.nextLine();

        if(username.length()<4 || username.length()>12){
            System.out.print("The user names needs to be between 4 to 12");
        }
        else if(username.contains(" ")||username.contains("_")){

            System.out.print("The username should not contain underscroll or space");

        }
        else{
            System.out.print("Hello "+username+" !");
        }


      scanner.close();

    }
}
