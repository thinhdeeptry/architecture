package com.thinne;
//noPattern
//import com.thinne.noPattern.Employee;
//statePattern
import com.thinne.statePattern.Employee;
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Đội Trưởng");
        employee.performDuties();

        Employee employee1 = new Employee("Nhân viên VP");
        employee1.performDuties();
    }
}