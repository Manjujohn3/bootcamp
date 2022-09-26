package com.employee;
import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {

        int choice;

        while (true)
        {
            System.out.println("select an option");
            System.out.println("1.Add employee");
            System.out.println("2.view employee");
            System.out.println("3.Exit");

            Scanner scanner=new Scanner(System.in);
            choice=scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Add employee selected");
                    break;
                case 2:
                    System.out.println("view employee selected");
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}