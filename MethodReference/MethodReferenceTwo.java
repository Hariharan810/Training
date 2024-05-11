package MethodReference;

import java.util.Arrays;

public class MethodReferenceTwo {

    public static void main(String[] args) {

//        EmployeeValidation employeeValidation = Employee::isValidEmployee;

        // Instance Method

        Employee employee = new Employee();
        EmployeeValidation employeeValidation = Employee::isValidEmployee;

//        EmployeeValidation employeeValidation = Employee :: isValidSalary;

        Employee employee1 = new Employee();
        System.out.println(employeeValidation.isValidEmployee(employee1));

        Employee employee2 = new Employee();
        employee2.setId(1);
        employee2.setName("ksdkds");

        System.out.println(employeeValidation.isValidEmployee(employee2));

        String[] values = {"fduhsd","jsdf","jhdsfu","jhag"};

//        Arrays.sort(values,(o1,o2) -> o1.compareToIgnoreCase(o2));
        Arrays.sort(values,String :: compareToIgnoreCase);

    }
}
