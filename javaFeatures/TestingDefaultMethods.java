package javaFeatures;

public class TestingDefaultMethods {
    public static void main(String[] args) {

        ClassOne one = new ClassOne();

        ClassTwo two = new ClassTwo();

        ClassThree three = new ClassThree();

        three.defaultMethodTwo();
        three.defaultMethodThree();

//        one.defaultMethodOne();
//        one.defaultMethodTwo();
//
//        two.defaultMethodOne();
//        two.defaultMethodTwo();


    }
}
