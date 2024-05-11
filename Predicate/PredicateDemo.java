package Predicate;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer> ageCheck = age -> age>21;
        System.out.println(ageCheck.test(67));
        System.out.println(ageCheck.test(12));

        if(ageCheck.test(55)){
            System.out.println("Eligible");
        }

        Employee employee1 = new Employee();
        employee1.setId(21);
        employee1.setName("Hari");
        employee1.setSalary(66666);

        Predicate<Employee> employeeCheck = emp -> emp.getSalary() > 25000;


        if (employeeCheck.test(employee1)){
            System.out.println("Above 25000");
        }
        else{
            System.out.println("Below 25000");
        }
    }
}
