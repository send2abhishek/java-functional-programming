package practice.functionalInterface.supplier;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        Supplier<String> result=()-> "result is Abhishek Aryan";

        System.out.println( result.get());
    }
}
