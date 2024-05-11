package Function;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<Integer,Double> halfValue = i -> i/2.0;
        Double result = halfValue.apply(10);
        System.out.println(result);

        Function<String,String> toUpper = String::toUpperCase;
        String toUpperCase = toUpper.apply("khjfdskj");
        System.out.println(toUpperCase);

        Function<String,String> functionCheckNull = str -> str == null ? "Enter valid String" : str;
        String value = functionCheckNull.andThen(toUpper).apply(null);
        System.out.println(value);
    }

}
