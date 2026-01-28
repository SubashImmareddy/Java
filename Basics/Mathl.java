import java.util.Scanner;
public class Mathl {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double result;

        result = Math.pow(2,5);//2^5
        result = Math.abs(-5);//5(mod)
        result = Math.sqrt(9);//3
        result = Math.round(3.14);//3
        result = Math.ceil(3.14);//4
        result = Math.floor(3.14);//3
        result = Math.max(5,10);//10
        result = Math.min(5,10);//5

        scanner.close();
    }
}
