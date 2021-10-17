package functionalInterface.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Functions {

    public static void main(String[] args) {

        Function<Integer, Integer> incrementByOne = number -> number + 1;
        Function<Integer, Integer> multiplyBy10 = number -> number * 10;

        Function<Integer, Integer> addAndMultiply = incrementByOne.andThen(multiplyBy10);

        BiFunction<Integer,Integer,Integer> incrementAndMultiply=(num1,num2)-> (num1+1) * num2;

        System.out.println(addAndMultiply.apply(10));
        System.out.println("increment and multiply "+incrementAndMultiply.apply(10,10));
    }
}
