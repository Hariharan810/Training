package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamInitialization {
    public static void main(String[] args) {


        List<String> list = List.of("dsad","sadsda","asd");
        Stream<String> stream1 = list.stream();

        System.out.println(stream1);

        String[] str = {"sds","dssda","gfddf"};
        Stream<String> stream2 = Arrays.stream(str);

        Stream<String> stream3 = Stream.of("fgfgh","jhgjhg","ghjghj");

        Stream<String> stream4 = Stream.generate(()->"hgfg");

        Stream.Builder<String> streamBuilder = Stream.builder();
        Stream<String> stream5 = streamBuilder.add("one").add("two").add("three").build();
    }
}
