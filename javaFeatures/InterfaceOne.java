package javaFeatures;

public interface InterfaceOne {

    void printNames();
    String getNames();

    default void defaultMethodOne(){
        System.out.println("Inside DefaultMethodOne");
    }

    default String defaultMethodTwo(){
        System.out.println("Inside DefaultMethodTwo");
        return "defaultMethodTwo";
    }

}
