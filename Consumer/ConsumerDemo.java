package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {


        List<String> names  = List.of("xfsd","dfs","dfsfds");
        Consumer<String> toUpperCase = str -> System.out.println(str.toUpperCase());
        names.forEach(toUpperCase);

        List<String> newValues = new ArrayList<String>();
        Consumer<String> addValues = s -> newValues.add(s);
        names.forEach(addValues);
        System.out.println(newValues);
    }
}
