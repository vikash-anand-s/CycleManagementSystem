import login.userdetails;

import java.util.Scanner;

public class loginmain {
    public static int chuser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1)Login to an existing account\n2)Make a new account\nChoose your option:");
        int i = sc.nextInt();
        if (i != 1 && i != 2) {
            System.out.println("Option not given. Please enter again.");
            chuser();
        }
        return i;
    }

    public static void main(String[] args) {
        int i = chuser();
        userdetails u = new userdetails();
        if (i == 1) {
            u.uslogin();
        } else if (i == 2) {
            u.newacc();
        }
    }
}
