package bookingoptions;

import java.io.IOException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class card {
    public static void clrscr(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }

    String name,type,name1,edate,cno;
    int price,cvv,otp;
    Random rand = new Random();
    int trid = rand.nextInt(99999999 - 10000000) + 10000000;
    Date last=java.util.Calendar.getInstance().getTime();

    public card(String n,int a,int otp)
    {
    name=n;
    price=a;
    this.otp=otp;
    getInput();

    }

public void getInput()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your card number:");
    cno=sc.next();
    if (cno.length()>16 || cno.length()<16)
    {
        clrscr();
        System.out.println("Card number not correct. Please type again.\n");
        getInput();
    }
    else{
        clrscr();
    System.out.println("Enter your card type:");
    type=sc.next().toUpperCase();
        clrscr();
    System.out.println("Enter your CVV:");
    cvv=sc.nextInt();
        clrscr();
    System.out.println("Enter the Expiry date:");
    edate=sc.nextLine();
    clrscr();
    payment();}
}

public void payment()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("OTP:" + this.otp);
    //find a way to make it come on terminal
    System.out.println("Enter your OTP:");
    int otpv = sc.nextInt();
    otp(this.otp,otpv);
    clrscr();
    System.out.println("Amount to be paid:"+price+"\nType y for yes and n for no:");
    String ch=sc.next();
    String cd=cno.substring(0,12);
    cno=cno.replace(cd,"************");
    clrscr();
    if (ch.equalsIgnoreCase("y"))
    {
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
        System.out.println("Name:"+name.toUpperCase()+"\nCard number:"+cno+"\nCard type:"+type+"\nAmount paid:"+price+"\nDate:"+last+"\nTransaction ID:"+trid);
        System.out.println("\nPayment done successfully. Enjoy your ride!");
    }
    else if(ch.equalsIgnoreCase("n"))
    { clrscr();
        System.out.println("Payment cancelled. Redirecting you back to home screen.");

    }

}

public void otp(int o1,int o2)
    {
        Scanner sc=new Scanner(System.in);
        if (o1==o2)
        {
            System.out.println("Pin Verified\n");
            clrscr();
        }
        else
        {
            clrscr();
            System.out.println("Pin not verified. Enter your PIN again\nPIN:");
            int o3=sc.nextInt();
            otp(o1,o3);
        }
    }
}
