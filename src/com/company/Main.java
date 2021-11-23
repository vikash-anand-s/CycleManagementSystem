package com.company;
public class Main {

    public static void main(String args[]) {
        Cycle defaultCycle;
        defaultCycle = new Cycle();
        User user1;
        user1 = new User("Vaishnav", "vaishnav@gmail.com", 9804703430L, 19);

        RideDetail ride1;
        ride1 = new RideDetail(defaultCycle, user1);

        ride1.cycle.display();
        ride1.user.display();
    }
}
