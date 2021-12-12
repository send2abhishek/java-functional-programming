package practice.functionalInterface.nullable;


import practice.functionalInterface.model.Employee;

import java.util.Optional;

public class _Optional {

    public static void main(String[] args) {

        Employee employee = null;

        Optional<Employee> empDetails = Optional.ofNullable(employee);

        Employee newEmp = empDetails.orElse(new Employee(1, "Abhiske", 27));

        System.out.println(newEmp.getAge());

        empDetails.ifPresentOrElse(emp -> System.out.println("employee name is " + emp.getName()), () -> System.out.println("looks good"));


    }
}
