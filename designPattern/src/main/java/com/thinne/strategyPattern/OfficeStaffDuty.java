package com.thinne.strategyPattern;

public class OfficeStaffDuty implements DutyStrategy {
    public void performDuties() {
        System.out.println("Công việc: Pha trà, Phê duyệt giấy tờ");
    }
}
