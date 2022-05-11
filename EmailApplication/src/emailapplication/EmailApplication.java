/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emailapplication;

import java.util.Scanner;

/**
 *
 * @author Marek
 */
public class EmailApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First name:");
        String name = scan.nextLine();
        System.out.println("Last name:");
        String lastName = scan.nextLine();
        Email em1 = new Email(name, lastName);
        System.out.println(em1.showInfo());
    }
    
}
