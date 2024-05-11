package FunctionalInterface;

@FunctionalInterface
public interface CalcOperation {

    // with parameter
    double operation(int a,int b);

    default void defaultMethodOne(){
        System.out.println("Inside DefaultMethodOne");
    }

    static void staticMethodOne(){
        System.out.println("Inside StaticMethodOne");
    }

}
