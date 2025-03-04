package com.thinne.statePattern;

public class TeamLeaderState implements PositionState {
    public void performDuties() {
        System.out.println("Công việc: Đi tuần, Gán việc cho nhân viên");
    }
}
