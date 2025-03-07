package com.thinne;

import com.thinne.decoratorPattern.BasicEmployee;
import com.thinne.decoratorPattern.DirectorDecorator;
import com.thinne.decoratorPattern.TeamLeaderDecorator;
import com.thinne.decoratorPattern.Employee;
//noPattern
//import com.thinne.noPattern.Employee;
//statePattern
//import com.thinne.statePattern.Employee;
public class Main {
    public static void main(String[] args) {
        Employee teamLeader = new TeamLeaderDecorator(new BasicEmployee());
        teamLeader.performDuties();

        Employee director = new DirectorDecorator(new BasicEmployee());
        director.performDuties();
    }
}