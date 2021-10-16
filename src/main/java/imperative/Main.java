package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> people = List.of(

                new Person("Abhishek kumar", Gender.MALE),
                new Person("Aryan", Gender.MALE),
                new Person("Arti", Gender.FEMALE)

        );

        people.forEach(person -> {
            System.out.println(person.toString());
        });

        // to create the list whose gender is female

        // imperative approach
        System.out.println("lets see who are the females in the list");
        System.out.println("// imperative approach");
        List<Person> females = new ArrayList<>();

        people.forEach(person -> {

            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        });

        females.forEach(person -> {
            System.out.println(person.toString());
        });

        // declarative approach
        System.out.println("lets see who are the females in the list");
        System.out.println("// declarative approach");

        Predicate<Person> personPredicate=element -> Gender.FEMALE.equals(element.gender);



        List<Person> femaleList = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        femaleList.forEach(System.out::println);



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
