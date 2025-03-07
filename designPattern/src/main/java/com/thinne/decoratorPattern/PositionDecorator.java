package com.thinne.decoratorPattern;

abstract class PositionDecorator implements Employee {
    protected Employee employee;

    public PositionDecorator(Employee employee) {
        this.employee = employee;
    }

    public void performDuties() {
        employee.performDuties();
    }
}
