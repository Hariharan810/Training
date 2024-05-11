package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {


        List<Employee> employeeList = employeeList();

        Stream<Employee> employeeStream1 = employeeList.stream();

        List<String> listOfEmployeeNames = employeeStream1.map(employee -> employee.getName()).toList();
        System.out.println(listOfEmployeeNames);

        //filter
//        Stream<Employee> employeeStream2 = employeeList.stream();
//        List<String> lostOfEmployeeAbove25 = employeeStream2.filter(emp->(emp.getAge()>25))
//                .map(employee -> employee.getName()).toList();

        List<String> lostOfEmployeeAbove25 = employeeList.stream().filter(employee -> employee.getAge()>25)
                .map(employee -> employee.getName())
                .toList();
        System.out.println(lostOfEmployeeAbove25);

        //distinct
        //forEach
//        employeeList.stream().map(employee -> employee.getCity())
//                .distinct()
//                .forEach(System.out::println);


        long count = employeeList.stream().filter(employee -> employee.getSalary()>70000)
                .count();
        System.out.println(count);


        List<Employee> first3Emp = employeeList.stream().limit(3)
                .toList();
        System.out.println(first3Emp);

        List<Integer> empSorted =  employeeList.stream()
                .map(employee -> employee.getId())
                .sorted()
                .toList();
        System.out.println(empSorted);

        //comparator

        List<Employee> sortedEmpObj = employeeList.stream()
                .sorted((e1,e2)->{
                    return e1.getId()-e2.getId();
                }).toList();
        System.out.println(sortedEmpObj);

        //peek

        List<Employee> peek = employeeList.stream().peek(System.out::println)
                .filter(employee -> employee.getYearOfJoining()>2015).toList();
        System.out.println(peek);
    }



        public static List<Employee> employeeList(){
            List<Employee> employeeList = new ArrayList<>();



            employeeList.add(new Employee(6,"jack","london",45,"Male","cse",2020,200000));
            employeeList.add(new Employee(7, "Emily", "New York", 35, "Female", "Marketing", 2015, 80000));
            employeeList.add(new Employee(8, "Michael", "Los Angeles", 40, "Male", "Finance", 2018, 100000));
            employeeList.add(new Employee(9, "Sophia", "Chicago", 18, "Female", "Engineering", 2019, 75000));
            employeeList.add(new Employee(10, "William", "Houston", 33, "Male", "Sales", 2016, 90000));
            employeeList.add(new Employee(11, "Olivia", "Phoenix", 21, "Female", "Human Resources", 2017, 85000));
            employeeList.add(new Employee(12, "James", "Philadelphia", 38, "Male", "CSE", 2014, 95000));
            employeeList.add(new Employee(13, "Emma", "San Antonio", 31, "Female", "Marketing", 2013, 70000));
            employeeList.add(new Employee(14, "Alexander", "San Diego", 27, "Male", "Engineering", 2012, 110000));
            employeeList.add(new Employee(15, "Ava", "Dallas", 36, "Female", "Sales", 2011, 85000));
            employeeList.add(new Employee(16, "Daniel", "San Jose", 42, "Male", "Finance", 2010, 120000));

            return employeeList;

        }



}
