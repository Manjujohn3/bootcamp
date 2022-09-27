package com.calculator;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int choice;

        while (true)
        {
            System.out.println("select an option");
            System.out.println("1.  Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5.Exit");

            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();

            System.out.println("Enter the operands");
            int a= sc.nextInt();
            int b= sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println(a+b);
                    break;
                case 2:
                    System.out.println(a-b);
                    break;
                case 3:
                    System.out.println(a*b);
                    break;
                case 4:try {
                    System.out.println(a / b);
                }
                catch(ArithmeticException e)
                {
                    System.out.println(e);
                }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}