public class method1 {
    public static void main(String[] args){

        int age = 25;
        if(ageCheck(age)){
            System.out.println("You are above 18+");
        }
        else{
            System.out.println("You are under 18");
        }



    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy birthday to you! ");
        System.out.printf("Happy birthday dear %s!\n",name);
        System.out.printf("You are %d years old\n",age);
        System.out.println("Happy birthday to you! ");

    }
    static double square (double number){
        return number*number;

    }
    static double cube (double number){
        return number*number*number;

    }
    static String getFullName(String first,String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }
}
