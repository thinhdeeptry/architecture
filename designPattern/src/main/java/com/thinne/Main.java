package com.thinne;

//strategyPattern

import com.thinne.strategyPattern.Employee;

//DecoratorPattern
//import com.thinne.decoratorPattern.BasicEmployee;
//import com.thinne.decoratorPattern.DirectorDecorator;
//import com.thinne.decoratorPattern.TeamLeaderDecorator;
//import com.thinne.decoratorPattern.Employee;
//noPattern
//import com.thinne.noPattern.Employee;
//statePattern
//import com.thinne.statePattern.Employee;
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Đội Trưởng");
        employee.performDuties();

        Employee employee2 = new Employee("Nhân viên VP");
        employee2.performDuties();
    }
}