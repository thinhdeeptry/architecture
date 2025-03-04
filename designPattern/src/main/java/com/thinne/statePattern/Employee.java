package com.thinne.statePattern;

public class Employee {
    private PositionState state;
    public Employee(String position) {
        switch (position) {
            case "Đội Trưởng":
                this.state = new TeamLeaderState();
                break;
            case "Giám đốc":
                this.state = new DirectorState();
                break;
            case "Nhân viên VP":
                this.state = new OfficeStaffState();
                break;
            default:
                this.state = () -> System.out.println("Chức vụ không hợp lệ");
        }
    }

    public void performDuties() {
        state.performDuties();
    }
}
