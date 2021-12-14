package login;


import java.util.Scanner;

public class userdetails {
    Scanner sc = new Scanner(System.in);
    public String user;
    public String pass;
    public String email;
    public String phone;
    char[] small = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};


    public void uslogin() {
        System.out.println("Enter username and password\nUsername:");
        user = sc.next();
        System.out.println("\nPassword:");
        pass = sc.next();
        System.out.println("Login Successful.");
        /*else{
       System.out.println("Error. Enter your details again.");
       uslogin();*/
    }


    public void newacc() {
        System.out.println("Enter username and password\nUsername:");
        user = sc.next();
        System.out.println("\nPassword:");
        pass = sc.next();
        System.out.println(small.length);
        boolean flag1 = false, flag2 = false;
        for (int i = 0; i < small.length; i++) {
            System.out.println(small[i]);
            if (pass.contains(Character.toString(small[i]))) {
                flag1 = true;
                break;
            }
        }

        for (int i = 0; i < num.length; i++) {
            if (pass.contains(Integer.toString(num[i]))) {
                flag2 = true;
                break;
            }

        }
        System.out.println(flag1+"\n"+flag2);

        System.out.println("Re-enter password:");
        String pass1 = sc.next();
        if (pass1.equals(pass)) {
            if (flag1 == true && flag2 == true) {
                System.out.println("Password successful");
            } else {
                System.out.println("Password must contain 1 number and 1 small alphabet. Please try again.");
                newacc();
            }
        } else {
            System.out.println("Passwords did not match. Please try again.");
            newacc();
        }
        System.out.println("Phone number:");
        phone=sc.next();
        if (phone.length()!=10)
        {
            System.out.println("\nPhone number should have 10 digits. Please enter it again.");
            System.out.println("Phone number:");
            phone=sc.next();
        }
        System.out.println("Email:");
        email=sc.next();
        System.out.println(user+",\nYour new account has been created.");
    }
}


