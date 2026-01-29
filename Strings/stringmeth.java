public class stringmeth {
    public static void main(String[] args){

        String name = "Subash Reddy";

        int length = name.length();
        int letter = name.charAt(0);
        int index=name.indexOf("b");
        int lastindex=name.lastIndexOf("d");

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("a","b");

        if(name.isEmpty()){
             System.out.println("Your name is empty:");
        }
        else{
            System.out.println("Hello "+name+" !");
        }

        if(name.contains(" ")){
            System.out.println("Your name contains S");

        }
        else{
            System.out.println("Your name not have S");
        }

        //name.equals("") case sensitive
        //name.IgnoreCase("") not case senstive


    }

}
