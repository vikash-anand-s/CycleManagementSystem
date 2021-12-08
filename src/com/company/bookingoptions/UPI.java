package bookingoptions;

import java.io.IOException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
public class UPI {
    public static void clrscr(){


        try {

            if (System.getProperty("os.name").contains("Windows"))

                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            else

                Runtime.getRuntime().exec("clear");

        } catch (IOException | InterruptedException ex) {}

    }

    public String num,name;
    public float amt;
    public int otp;
    Random rand = new Random();
    int trid = rand.nextInt(99999999 - 10000000) + 10000000;
    Date last=java.util.Calendar.getInstance().getTime();

    public UPI(String n, float a,int otp)
    {
        name=n;
        amt=a;
        this.otp=otp;
        getInput();
    }

    public void getInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your phone number:");
        String n=sc.next();
        if (n.length()<10 || n.length()>10)
        {
            clrscr();
            System.out.println("Phone number not correct. Please enter again.\n");
            getInput();
        }
        else{
            num=n;
           clrscr();
        System.out.println("OTP:" + this.otp);
        //find a way to make it come on terminal
        System.out.println("\nEnter your OTP:");
        int otpv = sc.nextInt();
        otp(this.otp,otpv);}
    }

    public void otp(int o1,int o2)
    {
        Scanner sc=new Scanner(System.in);

        if (o1==o2)
        {
            System.out.println("Pin Verified\n");
            clrscr();
            payment();
        }
        else
        {
            System.out.println("Pin not verified. Enter your PIN again\nPIN:");
            int o3=sc.nextInt();
            otp(o1,o3);
        }
    }

    public void payment() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Amount to be paid:"+amt+"\nType y for yes and n for no:");
        String ch=sc.next();
        clrscr();
        if (ch.equalsIgnoreCase("y"))
        {
           String number=num.substring(0,6);
           num=num.replace(number,"******");
            System.out.println("Processing payment......");
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(1000);
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
            clrscr();
            System.out.println("Name:"+name+"\nAmount paid:"+amt+"\nPhone number:"+this.num+"\nDate:"+last+"\nTransaction ID:"+trid);
            System.out.println("\nPayment done successfully. Enjoy your ride!");
        }
        else if(ch.equalsIgnoreCase("n"))
        {
            System.out.println("Payment cancelled. Redirecting you back to home screen.");
            clrscr();
        }
    }

}
