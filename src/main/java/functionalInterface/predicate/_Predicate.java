package functionalInterface.predicate;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        Predicate<Integer> isValid = age -> age > 18;

        if(isValid.test(20)){

            System.out.println("you are eligible");
        }
    }
}
