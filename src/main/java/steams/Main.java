package steams;

import steams.mockdata.MockData;
import steams.model.Person;


public class Main {

    private static void  display(Person person) {
        System.out.println(person.getFirstName());
    }

    public static void main(String[] args) {

        // get the list of 2 people whose age is less than 30
      MockData.getData().stream().filter(person -> person.getAge()<30).limit(2).forEach(Main::display);
    }
}
