/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emailapplication;

import java.util.Scanner;

/**
 *
 * @author Marek
 */
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int defaultPasswordLength = 11;
    private String department;
    private String companySuffix = "copanyabc.com";
    private int mailboxCapacity = 500;
    private String alternateEmail;
    
    //    Constructor to resolve first and last name
    public Email (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    //    call a method asking for the department - return the department
        this.department = setDepartment();
        
//        call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
        
//        combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    //    Ask for department
    private String setDepartment() {
        System.out.println("Enter the department number\n1. Sales\n2. Development\n3. Accounting\n0. None");
        Scanner scan = new Scanner(System.in);
        int depChoice = scan.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "development";
        } else if (depChoice == 3) {
            return "accounting";
        } else {
            return "";
        }
    }

    //    Generate a random password

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //    Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //    Set the alternate email
    public void setAltEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //    change the password
    public void changePassword(String password) {
        this.password = password;
    }
    
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    
    public String getAlternateEmail() {
        return alternateEmail;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "MB";
    }
}
