package callbacks;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        runCode("abhishek",null,name-> System.out.println(name));
    }

    static void runCode(String name, String lastName, Consumer<String> callback) {

        if (lastName != null) {
            System.out.println(name);
        } else {
            callback.accept("last name not provided");
        }
    }
}
