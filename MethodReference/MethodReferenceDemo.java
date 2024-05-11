package MethodReference;

public class MethodReferenceDemo {

    public static void main(String[] args) {

            ConvertToUpperCase toUpperCase = (value1) -> {
                return value1.toUpperCase();
            };

        System.out.println(toUpperCase.convertToUpperCase("hello"));

        ConvertToUpperCase toUpperCase1 = String :: toUpperCase;

        System.out.println(toUpperCase1.convertToUpperCase("ldsjljlfsd"));


    }
}
