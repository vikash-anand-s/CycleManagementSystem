import bookingoptions.UPI;
import bookingoptions.card;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

//Driver code
public class cycle {
    public static int otp()
    {
        Random rand = new Random();
        int otp = rand.nextInt(9999 - 1000) + 1000;
        return otp;
    }
    public static void chupi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Available UPI options\n1)PayTM\n2)Phonepe\n3)Google Pay\nChoose your preferred UPI option:");
        try {
            int upi = sc.nextInt();
            clrscr();
        } catch (NumberFormatException e) {
            System.out.println("Error. Enter a number.");
            chupi();
        }
    }
        public static void chcard()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Available Credit/Debit Card options\n1)SBI\n2)HDFC\n3)IDBI\n4)Bank of Baroda\nChoose your preferred UPI option:");
            try {
                int card = sc.nextInt();
                clrscr();
            } catch (NumberFormatException e) {
                System.out.println("Error. Enter a number.");
                chcard();
            }
        }
    public static void clrscr(){
        try {

            if (System.getProperty("os.name").contains("Windows"))

                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            else

                Runtime.getRuntime().exec("clear");

        } catch (IOException | InterruptedException ex) {}

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        clrscr();
        System.out.println("Available Payment Options\n1)UPI\n2)Debit/Credit card\nChoose your preferred payment option:");
        int Poption = sc.nextInt();
        clrscr();
        switch (Poption) {
            case 1:
                chupi();
                UPI u = new UPI("Vaishnav Viju", 250,otp());

            case 2:
                chcard();
                card c=new card("Vaishnav Viju",250,otp());
        }
    }
}

