package functions;

import java.util.function.Function;

public class _Functions {

    public static void main(String[] args) {

        Function<Integer, Integer> incrementByOne = number -> number + 1;
        Function<Integer, Integer> multiplyBy10 = number -> number * 10;

        Function<Integer, Integer> addAndMultiply = incrementByOne.andThen(multiplyBy10);

        System.out.println(addAndMultiply.apply(10));
    }
}
