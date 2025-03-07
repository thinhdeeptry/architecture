package com.thinne.strategyPattern;

public class Employee {
    private DutyStrategy dutyStrategy;

    public Employee(String position) {
        setPosition(position);
    }

    public void setPosition(String position) {
        switch (position) {
            case "Đội Trưởng":
                this.dutyStrategy = new TeamLeaderDuty();
                break;
            case "Giám đốc":
                this.dutyStrategy = new DirectorDuty();
                break;
            case "Nhân viên VP":
                this.dutyStrategy = new OfficeStaffDuty();
                break;
            default:
                this.dutyStrategy = () -> System.out.println("Chức vụ không hợp lệ");
        }
    }

    public void performDuties() {
        dutyStrategy.performDuties();
    }
}
