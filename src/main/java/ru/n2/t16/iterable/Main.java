package ru.n2.t16.iterable;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Company company=new Company();
        Employee[] employees={
                new Employee("111"),
                new Employee("222"),
                new Employee("333")
        };
        company.setEmployees(employees);

        for (Employee employee:company){
            System.out.println(employee);
        }

        Iterator<Employee> iterator=company.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
