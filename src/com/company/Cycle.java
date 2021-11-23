package com.company;

import java.util.Date;

public class Cycle {
    int cycleNo;
    String name, model, colour;
    Date last;

    public Cycle()
    {
        cycleNo = 1;
        name = "Hero";
        model = "Hero";
        colour = "White";
    }
    public Cycle(int cno,String name,String model,String colour)
    {
        this.cycleNo = cno;
        this.name = name;
        this.model = model;
        this.colour = colour;
    }
    public void display()
    {
        System.out.print("\n--------Your Cycle details--------\nCycle number: "+this.cycleNo+"\nName: "+this.name+"\nModel: "+this.model+"\nColour: "+this.colour+"\nLast trip: ");
        if (last == null)
            System.out.println("First trip");
        else
            System.out.println(last);
        last = java.util.Calendar.getInstance().getTime();
    }

}