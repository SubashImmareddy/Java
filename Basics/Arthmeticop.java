public class Arthmeticop {
    public static void main (String[] args){


        int a = 10;
        int b = 2;
        int c;

        //Arthmritc Operations

        c=a+b;
        c=a-b;
        c=a*b;
        c=a/b; // gives quotient
        c=a%b; //gives remainder

        //Augmented Assignment Operators

        int x=10;
        int y=3;

        x+=y; // x+y=x
        x-=y; // x-y=x
        x*=y; // x*y=x
        x/=y; // x/y=x
        x%=y; // x%y=x

        //Increment and Decrement Operators

        int z=1;

         z++; //z+1=z
         z--; //z-1=z

        //order of operations [P-E-M-D-A-S]
        //order to solve

        double result = 3+4*(7-5)/2.0;
        System.out.print(result);




    }
}