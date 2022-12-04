package com.bridgelabz.oops;
import java.util.Scanner;
public class StockPortfolioMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockPortfolio object = new StockPortfolio();
        /**
         * while loop to calling method
         */
        while(true) {
            System.out.println("1. Enter New Stock \n2. Display Stock Report \n3. Withdraw Amount From Account Balance \n4. Exit ");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            /**
             * switch to take choice which method to call
             */
            switch (choice) {
                case 1:
                    object.addStock();
                    break;
                case 2:
                    object.stockReport();
                    break;
                case 3:
                    object.debit();
                    break;
                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}

