package functionalInterface.stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {


        List<Person> people = List.of(

                new Person("Abhishek kumar", Gender.MALE),
                new Person("Aryan", Gender.MALE),
                new Person("Arti", Gender.FEMALE),
                new Person("soni", Gender.FEMALE),
                new Person("sandhya", Gender.FEMALE),
                new Person("Ram", Gender.MALE)

        );


        // transform the people list to employee list
        Function<Person, Employee> employeeFunction = person ->
                new Employee(person.name, person.gender.toString(), person.gender.equals(Gender.MALE) ? "IT" : "Doctor");

        people.stream().map(employeeFunction).forEach(System.out::println);

        // remove duplicates
        people.stream().map(person -> person.gender).collect(Collectors.toSet()).forEach(System.out::println);

    }


    static class Person {

        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE;
    }
}
