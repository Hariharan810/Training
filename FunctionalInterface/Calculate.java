package FunctionalInterface;

@FunctionalInterface
public interface Calculate {

    void printNames();

    default void defaultMethodOne(){
        System.out.println("Inside DefaultMethodOne");
    }

    default void defaultMethodTwo(){
        System.out.println("Inside DefaultMethodTwo");
    }

    static void staticMethodOne(){
        System.out.println("Inside StaticMethodOne");
    }

    static void staticMethodTwo(){
        System.out.println("Inside StaticMethodTwo");
    }
}
