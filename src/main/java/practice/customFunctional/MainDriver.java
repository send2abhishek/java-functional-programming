package practice.customFunctional;

import practice.customFunctional.custom.About;

import java.util.function.*;

public class MainDriver {
    public static void main(String[] args) {

        About about = (name) -> "how you are doing " + name;
        System.out.println(about.greetMe("Abhishek Aryan"));

        BiConsumer<String, String> name = (t, e) -> System.out.println("this is consumer " + t + " " + e);
        name.accept("abhishek", "aryan");

        Predicate<Integer> isAdult = (t) -> t > 18;
        System.out.println("Abhishek is adult " + isAdult.test(30));

        BiPredicate<Integer, Integer> isOk = (x, y) -> x > 10 && y > 20;
        System.out.println("this is new test to perform with bipredicate " + isOk.test(40, 30));

        Function<Integer, Integer> increment = (item) -> item + 1;
        System.out.println("fuctions takes input and returns output "+increment.apply(10));

        Supplier<String> output=()-> "supplier takes nothing but provide the output";

        System.out.println(output.get());
    }
}
