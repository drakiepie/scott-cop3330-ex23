package org.example;

import java.util.Locale;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Exercise 23 Solution
 *  Copyright 2021 Drake Scott
 */

public class ex23 {
    static Scanner input = new Scanner(System.in);

    public static boolean answer(){
        String ans = input.next();
        ans = ans.toLowerCase();
        if (ans.equals("y")){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Press \"y\" for yes, and \"n\" for no.");
        System.out.print("Is the car silent when you turn the key? ");
        if(answer()){
            System.out.print("are the battery terminals corroded? ");
            if(answer()){
                System.out.print("Clean terminals and try starting again.");
            }
            else {
                System.out.print("Replace cables and try again.");
            }
        }
        else {
            System.out.print("does the care make a slicking noise? ");
            if(answer()){
                System.out.print("Replace the battery.");
            }
            else {
                System.out.print("Does the car crank up but fail to start? ");
                if(answer()){
                    System.out.println("Check spark plug connections.");
                }
                else {
                    System.out.println("Does the engine start and then die? ");
                    if(answer()){
                        System.out.print("Does your car have fuel injection? ");
                        if(answer()){
                            System.out.print("Get it in for service.");
                        }
                        else {
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }

}
