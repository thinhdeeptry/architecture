package com.thinne.strategyPattern;

public class TeamLeaderDuty implements DutyStrategy {
    public void performDuties() {
        System.out.println("Công việc: Đi tuần, Gán việc cho nhân viên");
    }
}
