package practice.functionalInterface.callbacks;

import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class _Callbacks {

    private static void result(int a, int b, BiConsumer<Integer, Integer> cb, Predicate<Integer> predicate) {
        if (predicate.test(a)) {
            cb.accept(a, b);
        }
        System.out.println("something went wrong");

    }

    public static void main(String[] args) {

        result(10, 20, (a, b) -> System.out.println("multiply result is " + a * b), (a) -> a < 0);


    }


}
