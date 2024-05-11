package javaFeatures;

public class ClassTwo implements InterfaceOne{

    @Override
    public void printNames() {
        System.out.println("Class Two PrintNames");
    }

    @Override
    public String getNames() {
        System.out.println("Class Two getNames");
        return "";
    }
}
