import java.util.Scanner;
public class userinput {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = scanner.nextLine();

        System.out.print("Enter age:");
        int age = scanner.nextInt();

        System.out.print("Enter grade:");
        double grade = scanner.nextDouble();

        System.out.print("Student(true/false):");
        boolean student = scanner.nextBoolean();

        System.out.println("Hello "+name);
        System.out.println("Your grade:"+grade);
        System.out.println(name +" " + "is"+" "+age+" "+"old");
        if (student) {
            System.out.println(name + " " + "is enrolled");
        }
        else{
            System.out.println(name+" "+"is not enrolled");
        }
      scanner.close();

    }
}