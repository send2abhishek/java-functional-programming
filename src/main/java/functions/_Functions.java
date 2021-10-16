package functions;

import java.util.function.Function;

public class _Functions {

    public static void main(String[] args) {

        Function<Integer, Integer> incrementByOne = number -> number + 1;

        Integer result = incrementByOne.apply(10);
        System.out.println(result);
    }
}
