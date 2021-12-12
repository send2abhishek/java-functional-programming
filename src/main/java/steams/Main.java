package steams;

import steams.mockdata.MockData;
import steams.model.Person;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    private static void display(Person person) {
        System.out.println(person.getFirstName());
    }

    private static List<Person> getData() {
        return MockData.getData();
    }

    // get the list of data whose age is less than 30
    private static void filterList() {
        getData().stream().filter(person -> person.getAge() < 30).limit(2).forEach(Main::display);
    }

    private static void intStreamTest() {
        // implement range
        IntStream.range(0, 10).forEach(System.out::println);

        List<Person> persons = getData();
        IntStream.range(0, persons.size()).forEach(index -> display(persons.get(index)));
    }

    private static void minNumber() {

        List<Integer> numbers = List.of(20, 10, 40, 60, 2, 100);


        Optional<Integer> minNumber = numbers.stream().min((a, b) -> a > b ? 1 : -1);

        System.out.println("min number is " + minNumber.get());

        numbers.stream().sorted((a, b) -> a > b ? 1 : -1).forEach((a) -> System.out.println(a));

    }

    private static void removeDuplicates() {
        new HashSet<>(getData()).forEach(Main::display);
    }

    private static void femalesSumCount() {
        int female = getData().stream().filter(person -> person.getGender()
                        .equalsIgnoreCase("female"))
                .mapToInt(person -> person.getAge()).sum();
        System.out.println(female);
    }


    public static void main(String[] args) {

//        filterList();
//        intStreamTest();
//        minNumber();
 //       removeDuplicates();

        femalesSumCount();
    }


}
