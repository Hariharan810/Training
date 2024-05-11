package Supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<LocalDateTime> dateTime = () -> LocalDateTime.now();
        printDateTime(dateTime);
    }

    public static void printDateTime(Supplier<LocalDateTime> dateTimeSupplier){
        System.out.println(dateTimeSupplier.get());
        System.out.println(dateTimeSupplier.get());
    }
}
