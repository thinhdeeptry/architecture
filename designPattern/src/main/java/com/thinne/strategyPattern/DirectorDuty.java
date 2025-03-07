package com.thinne.strategyPattern;

public class DirectorDuty implements DutyStrategy {
    public void performDuties() {
        System.out.println("Công việc: Quản lý công ty, Đưa ra quyết định chiến lược");
    }
}
