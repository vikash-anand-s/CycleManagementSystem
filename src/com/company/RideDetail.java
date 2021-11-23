package com.company;

public class RideDetail {
    //This class has all the details of the current ride --- cycle, user, distance etc...
    Cycle cycle;
    User user;
    RideDetail(Cycle cycle, User user){
        this.cycle = cycle;
        this.user = user;
    }
}
