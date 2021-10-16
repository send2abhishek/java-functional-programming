package consumers;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        greet(new Customer("abhishek",2222));

        System.out.println("using consumer ");

        Consumer<Customer> customerConsumer=(customer ->  System.out.println("Hi "+customer.name + " "+ "mobile number is "+ customer.mobile));
        customerConsumer.accept(new Customer("abhishek",2222));
    }

    static void greet(Customer customer){

        System.out.println("Hi "+customer.name + " "+ "mobile number is "+ customer.mobile);

    }

    static class Customer{

        private final String name;
        private final int mobile;

        Customer(String name, int mobile) {
            this.name = name;
            this.mobile = mobile;
        }
    }
}
