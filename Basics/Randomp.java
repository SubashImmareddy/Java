import java.util.Random;
public class Randomp {
    public static void main(String[] args){
        Random random =new Random();
// dice roll
        int number;

        number=random.nextInt(1,7);
        System.out.println(number);

 // coinflip
     boolean isHeads;

     isHeads = random.nextBoolean();

     if(isHeads){
         System.out.println("Heads");
     }
     else{
         System.out.println("Tails");
     }

    }

}
