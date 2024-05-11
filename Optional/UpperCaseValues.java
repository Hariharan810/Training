package Optional;

import java.util.Optional;

public class UpperCaseValues {
    public static void main(String[] args) {

        Optional<String> str = getName();

//        str = str.toUpperCase();
//        System.out.println(str);

        if(str.isPresent()){
            String name = str.get();
            name = name.toUpperCase();
            System.out.println(name);
        }
        else {
            System.out.println("Value is not availabe");
        }
    }

    public static Optional<String> getName(){

        String str = "kjsaddkj";

        Optional<String> value = null;

        if(str == null){
            value = Optional.empty();
        }
        else{
            value = Optional.of(str);
        }

        return value;
    }
}
