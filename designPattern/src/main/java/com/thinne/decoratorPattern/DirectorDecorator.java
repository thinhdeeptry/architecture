package com.thinne.decoratorPattern;

public class DirectorDecorator extends PositionDecorator {
    public DirectorDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void performDuties() {
        super.performDuties();
        System.out.println("Công việc thêm: Quản lý công ty, Đưa ra quyết định chiến lược");
    }
}
