package javaFeatures;

public class ClassOne implements InterfaceOne {

    @Override
    public void printNames() {
        System.out.println("Print Names");
    }

    @Override
    public String getNames() {
        System.out.println("Getting Names");
        return "";
    }

    public void defaultMethodOne(){
        System.out.println("Inside ClassOne -- DefaultMethodOne");
    }
}
