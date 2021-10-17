package combinatorPattern;

import java.util.function.Function;

public interface CustomerRegistration extends Function<Customer, CustomerRegistration.ValidationResult> {

    enum ValidationResult {

        SUCCESS, NAME_IS_INVALID, EMAIL_IS_NOT_VALID
    }

    static CustomerRegistration isNameValid() {

        return customer -> customer.getName().length() > 3 ? ValidationResult.SUCCESS : ValidationResult.NAME_IS_INVALID;
    }

    static CustomerRegistration isEmailValid() {

        return customer -> customer.getEmail().contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_IS_NOT_VALID;

    }

    default CustomerRegistration and(CustomerRegistration other) {

        return customer -> {
            ValidationResult result = this.apply(customer);

            return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
        };
    }
}
