package practice.functionalInterface.consumer;

import practice.functionalInterface.model.Employee;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {

        BiConsumer<Integer,String> empDetails=((age,name)-> System.out.println("name is "+name + " age is "+age));

        Consumer<String> profession=(name-> System.out.println("works in the "+name + " fields"));

        empDetails.andThen((age,name)-> System.out.println("internal input is age "+age + " name"+name)).accept(20,"Abhishek");
    }


}
