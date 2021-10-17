package functionalInterface.optional;

import functionalInterface.stream.Employee;

import java.util.Optional;

public class _Optional {

    public static void main(String[] args) {
        // when you are not sure the object could be null or have value use ofNullable
        Optional<String> name = Optional.ofNullable(null);

        // when you are sure that optional will have value then use .of method
        //Optional<String> name = Optional.of("Abhishek");

        // method reference
      //  System.out.println(name.map(String::toUpperCase).get());

        // isEmpty()() tells that value is empty in the optional or not
        System.out.println(name.isEmpty());

        // isPresent() tells that value is present in the optional or not
        System.out.println(name.isPresent());

        // set the default name as aryan when name is null
        String defaultName = name.orElse("Aryan");
        String orElseGet = name.orElseGet(()->"I am abhishek aryan");
        //String orElseThrow = name.orElseThrow(NullPointerException::new);
        System.out.println(defaultName);
        System.out.println(orElseGet);
       // System.out.println(orElseThrow);

        // is present or else
        name.ifPresent(System.out::println);

        name.ifPresentOrElse(System.out::println,()-> System.out.println("Abhishek"));


        Employee employee=new Employee("abhishek","male","IT");

        System.out.println(employee.getWork().orElse("email is not provided"));

        employee.getWork().ifPresentOrElse(System.out::println,()-> System.out.println("email not provided"));

    }
}
