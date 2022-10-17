package funtionalDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//public class SupplierDemo implements Supplier<String> { //TRADITIONAL APPROACH
//    @Override
//    public String get() {
//        return "Hello world it's supplier functional interface";
//    }
//
//    public static void main(String[] args) {
//        Supplier<String> supplier = new SupplierDemo();
//        System.out.println(supplier.get());
//    }

public class SupplierDemo{
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hi world another way to demonstrate supplier interface";
        //System.out.println(supplier.get());
        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(supplier));
    }
}
