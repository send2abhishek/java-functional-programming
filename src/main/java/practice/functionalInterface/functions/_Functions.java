package practice.functionalInterface.functions;

import java.util.function.Function;

public class _Functions {

    public static void main(String[] args) {
        Function<String, String> test = (name -> "this is the name " + name);

        System.out.println("result is " + test.apply("Abhishek Aryan"));

        Function<Integer, Integer> addByOne = (num -> num+1);
        Function<Integer, Integer> multiplyByten = (num -> num*num);

        System.out.println(addByOne.andThen(multiplyByten).apply(10));
    }
}
