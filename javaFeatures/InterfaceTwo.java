package javaFeatures;

public interface InterfaceTwo {

    default void defaultMethodThree(){
        System.out.println("Inside InterfaceTwo -- DefaultMethodThree");
    }
}
