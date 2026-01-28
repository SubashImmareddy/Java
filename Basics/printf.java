public class printf {
    public static void main (String[] args){
        // %[flags] [width][.precision][specifier-character]
        // [flags]
        // + = output a plus
        //, = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        String name = "Subash";
        char firstletter = 'S';
        int age = 30;
        double height = 5.11;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n",name);
        System.out.printf("Your name starts with a %c\n",firstletter);
        System.out.printf("Your age is %d\n",age);
        System.out.printf("your height is %f\n",height);
        if (isEmployed){
            System.out.printf("you are employed\n");
        }
        else{
            System.out.printf("You are unemployed\n");
        }

        double price1=9.89012;
        double price2=98.55515684;
        double price3=9999.645454868464455;

        //[width]
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding




        int id1=1;
        int id2=23;
        int id3=456;
        int id4=7890;

        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);





    }
}
