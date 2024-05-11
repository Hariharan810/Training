package FunctionalInterface;

public class CalcOpeartionImpl {

    public static void main(String[] args) {

        CalcOperation addition = (a, b) -> {
            return a+b;
        };

        CalcOperation subtraction = (a, b) -> a-b;

        double result = addition.operation(10, 20);
        System.out.println(result);

        System.out.println(subtraction.operation(399,89));
    }

}
