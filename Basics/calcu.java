import java.util.Scanner;
public class calcu {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double numb1;
        double numb2;
        char operator;
        double result=0;
        boolean validOperator = true;

        System.out.print("Enter the first number: ");
        numb1=scanner.nextDouble();

        System.out.print("Enter the operator +,-,*,/,^: ");
        operator=scanner.next().charAt(0);

        System.out.print("Enter the Second number: ");
        numb2=scanner.nextDouble();

        switch(operator) {
            case '+' -> result = numb1 + numb2;
            case '-' -> result = numb1 - numb2;
            case '*' -> result = numb1 * numb2;
            case '^' -> result = Math.pow(numb1, numb2);
            case '/' -> {
                if (numb2 != 0) {
                    result = numb1 / numb2;
                } else {
                    System.out.print("The 2nd number is 0 so not possible");
                }

            }
            default -> {
                System.out.println("Invalid operator");
                validOperator= false;
            }
        }
        if(validOperator) {
            System.out.println("The result is: " + result);
            scanner.close();
        }
    }
}
