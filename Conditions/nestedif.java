public class nestedif {
    public static void main(String[] args) {

        boolean isStudent = false;
        boolean issSenior = false;
        double rate = 9.99;

        if (isStudent) {
            if (issSenior) {
                System.out.print("You get a 10% of Student Discount\n");
                System.out.print("You get a 20% of Senior Discount\n");
                rate *= 0.7;
            } else {
                System.out.print("You get a 10% of Student Discount\n");
                rate *= 0.9;
            }
        }
        System.out.printf("Your ticket price is $%.2f", rate);
    }
}
