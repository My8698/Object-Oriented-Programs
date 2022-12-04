package com.bridgelabz.oops;
import java.util.ArrayList;
import java.util.Scanner;
public class StockPortfolio {
    /**
     * used arraylist of string datatype stockName for taking list of stock names
     */
    ArrayList<String> stockName = new ArrayList<String>();
    ArrayList<Integer> numberOfShare = new ArrayList<Integer>();
    ArrayList<Integer> sharePrice = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);
    int balance=20000;

    /**
     * addStock metho to add stock information
     */
    public void addStock() {
        System.out.println("Enter the Stock Name : ");
        stockName.add(scanner.next());
        System.out.println("Enter the number of Share : ");
        numberOfShare.add(scanner.nextInt());
        System.out.println("Enter the Share Price : ");
        sharePrice.add(scanner.nextInt());
    }
    /**
     * stockReport method to print report of given stock
     */
    public void stockReport() {
        System.out.println("****STOCK REPORT****");
        for (int i = 0; i < stockName.size(); i++) {
            int total = (numberOfShare.get(i) * sharePrice.get(i));

            System.out.println("Stock Name =" + stockName.get(i) + "\nValue of each share =" + sharePrice.get(i)
                    + "\nTotal value of share =" + total);
        }
    }
    /**
     * debit method to withdraw money from account of user
     */
    public void debit() {
        System.out.println("Enter the amount you want to withdraw: ");
        int withdraw = scanner.nextInt();
        if (withdraw < balance) {
            balance = balance - withdraw;
            System.out.println("Debit is succesful of amount :" + withdraw);
            System.out.println("Total amount left after withdrawal= " + balance);
        } else
            System.out.println("Debit amount exceeded account balance");
    }
}
