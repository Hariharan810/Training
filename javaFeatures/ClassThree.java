package javaFeatures;

public class ClassThree implements InterfaceOne, InterfaceTwo{

    @Override
    public void printNames() {
        System.out.println("Class Three PrintNames");
    }

    @Override
    public String getNames() {
        System.out.println("Class Three getNames");
        return "";
    }
}
