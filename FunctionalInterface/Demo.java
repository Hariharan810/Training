package FunctionalInterface;

public class Demo {
    public static void main(String[] args) {

        Calculate calculate = new Camel();

        calculate.printNames();

        Calculate calc = () -> {
            System.out.println("Camel company using lambda expression");
        };

        calc.printNames();
    }
}
