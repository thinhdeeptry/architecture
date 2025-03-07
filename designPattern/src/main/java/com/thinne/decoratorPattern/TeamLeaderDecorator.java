package com.thinne.decoratorPattern;

public class TeamLeaderDecorator extends PositionDecorator {
    public TeamLeaderDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void performDuties() {
        super.performDuties();
        System.out.println("Công việc thêm: Quản lý công việc của nhóm");
    }
}
