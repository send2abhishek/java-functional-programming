package steams.mockdata;


import steams.model.Person;

import java.util.List;

public class MockData {

    public static List<Person> getData() {
        return List.of(new Person(1, "Dixie", "O'Finan", "dofinan0@huffingtonpost.com", "Female", 91),
                new Person(1, "Harmon", "Marling", "hmarling1@moonfruit.com", "Male", 38),
                new Person(2, "Harmon", "Marling", "hmarling1@moonfruit.com", "Male", 20),
                new Person(3, "Beynon", "Dallas", "dbeynon2@rambler.ru", "Female", 25),
                new Person(4, "Abhishek", "Aryan", "hmarling1@moonfruit.com", "Male", 32),
                new Person(5, "Ram", "Mohan", "hmarling1@moonfruit.com", "Female", 43),
                new Person(6, "Raj", "Kumar", "hmarling1@moonfruit.com", "Male", 38),
                new Person(7, "Rahul", "Verma", "hmarling1@moonfruit.com", "Female", 38),
                new Person(7, "Sugandha", "gupta", "hmarling1@moonfruit.com", "Female", 26),
                new Person(7, "janvi", "singh", "hmarling1@moonfruit.com", "Female", 25),
                new Person(7, "Sugandha", "gupta", "hmarling1@moonfruit.com", "Female", 26),
                new Person(7, "janvi", "singh", "hmarling1@moonfruit.com", "Female", 25)

        );
    }
}
