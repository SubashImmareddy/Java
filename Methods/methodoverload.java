public class methodoverload {
    public static void main(String[] args) {

        String pizza = bakePizza("flat bread", "mozzaella", "pepperoni");

        System.out.print(pizza);
    }

    static String bakePizza(String bread) {
        return bread + "Pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + "Pizza";
    }

    static String bakePizza(String bread, String cheese, String toppings) {
        return toppings + " " + cheese + " " + bread + " Pizza";

    }
}