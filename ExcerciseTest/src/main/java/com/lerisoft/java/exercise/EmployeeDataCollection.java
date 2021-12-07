package com.lerisoft.java.exercise;

import java.util.*;
import static java.util.Comparator.comparing;

/**
 * This class is intend to display employee data in sorted based on First Name, Last Name, Department, Location
 */
public class EmployeeDataCollection {

    public static void main(String[] args) {

        ArrayList<Employee> listEmployee = getEmployees();

        /* Maintain the order based on firstname, lastname, department, location*/
        Collections.sort(listEmployee,
                comparing(Employee::getFirstName).
                        thenComparing(Employee::getLastName).
                        thenComparing(Employee::getDepartment).
                        thenComparing(Employee::getLocation));

        for (Employee str : listEmployee) {
            System.out.println("Employee Data : " + str.getFirstName() + " " + str.getLastName() +
                    " " + str.getDepartment() + " " + str.getLocation() + " " + str.getAge() + " " + str.getSalary());

        }
    }

    /**
     * @return list of Employee objects
     */
    private static ArrayList<Employee> getEmployees() {
        /* Creating array list to hold employee data*/
        ArrayList<Employee> listEmployee= new ArrayList<Employee>();

        /* We have considered all the possible scenarios and it is sorting as expected */
        listEmployee.add(new Employee("Vinay","Mathwal","Scrum Master","Pune",35,91000));
        listEmployee.add(new Employee("Rohan","Rathore","Java","Indore",35,80000));
        listEmployee.add(new Employee("Rohan","Garg",".Net","Pune",35,10000));
        listEmployee.add(new Employee("Amit","Sharma","Java","Indore",35,25000));
        listEmployee.add(new Employee("Amit","Agrawal","Automation","Hydrabad",38,53000));
        listEmployee.add(new Employee("Amit","Agrawal","Tester","Agra",37,15000));
        listEmployee.add(new Employee("Rohan","Rathore","Java","Chennai",35,32000));

        return listEmployee;
    }
}

/*In interest of making code readable/manageable creating inner class*/
class Employee {

    private String firstName;
    private String lastName;
    private String department;
    private String location;
    private int age;
    private double salary;

    /**
     * @param firstName
     * @param lastName
     * @param department
     * @param location
     * @param age
     * @param salary
     */
    public Employee(String firstName, String lastName, String department, String location, int age, double salary) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.department=department;
        this.location=location;
        this.age=age;
        this.salary=salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
