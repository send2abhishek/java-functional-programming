package steams;

import steams.mockdata.MockData;
import steams.model.Person;

import java.util.List;



public class Main {
    private static void  display(Person person) {
        System.out.println(person.getFirstName());
    }

    private static List<Person> getData(){
        return MockData.getData();
    }

    // get the list of data whose age is less than 30
    private static void filterList(){
        getData().stream().filter(person -> person.getAge()<30).limit(2).forEach(Main::display);
    }


    public static void main(String[] args) {

        filterList();


    }



}
