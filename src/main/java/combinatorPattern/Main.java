package combinatorPattern;

import static combinatorPattern.CustomerRegistration.isEmailValid;
import static combinatorPattern.CustomerRegistration.isNameValid;

public class Main {

    public static void main(String[] args) {
        Customer customer=new Customer("Abhishek","send2abhishek");

        CustomerRegistration.ValidationResult validationResult = isEmailValid().and(isNameValid()).apply(customer);

        System.out.println(validationResult);

        if(!validationResult.equals(CustomerRegistration.ValidationResult.SUCCESS)){

            throw new IllegalStateException(validationResult.name());
        }
    }
}
