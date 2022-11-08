package commercialdata;

import java.util.Scanner;

    public class StockAccount {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            StockOperation stockOperation = new StockOperation();
            stockOperation.addStock();

            operation();
        }

        public static void operation() {
            Scanner scan = new Scanner(System.in);

            StockOperation stockOperation = new StockOperation();

            while (true) {
                System.out.println("\nPlease enter your choice : "
                        + "\n1.Buy Shares"
                        + "\n2.Sell Shares"
                        + "\n3.Credit amount"
                        + "\n4.Debit amount"
                        + "\n5.Print Account Balance"
                        + "\n6.Print Particular Stock Details"
                        + "\n7.Print Portfolio Details"
                        + "\n8.Exit");

                int choice = scan.nextInt();
                int amount;
                String symbol;

                switch (choice) {

                    case 1:
                        System.out.println("Enter the stock symbol you want to buy : ");
                        symbol = scan.next();
                        System.out.println("Enter total amount for buy shares");
                        amount = scan.nextInt();
                        stockOperation.buy(amount, symbol);
                        break;

                    case 2:
                        System.out.println("Enter the stock symbol you want to sell : ");
                        symbol = scan.next();
                        System.out.println("Enter value of share to be sell : ");
                        amount = scan.nextInt();
                        stockOperation.sell(amount, symbol);
                        break;

                    case 3:
                        System.out.println("Enter amount to deposit in account : ");
                        amount = scan.nextInt();
                        Account.credit(amount);
                        System.out.println("Thank you for banking with us.....");
                        break;

                    case 4:
                        System.out.println("Enter the amount to withdraw from account :");
                        amount = scan.nextInt();
                        Account.debit(amount);
                        System.out.println("Thank you for banking with us.....");
                        break;

                    case 5:
                        stockOperation.valueOf();
                        break;

                    case 6:
                        System.out.println("Enter the stock symbol you want to see details : ");
                        symbol = scan.next();
                        stockOperation.printStockReport(symbol);
                        break;

                    case 7:
                        stockOperation.printWholeStock();
                        break;

                    case 8:
                        System.out.println("Exit from stock management account");
                        return;

                    default:
                        System.out.println("Enter valid choice between 1 to 7");
                }
                break;
            }
            System.out.println("\nDo you want to perform anything???\nPress Y to continue");
            String s = scan.next();
            if (s.equalsIgnoreCase("y"))
            {
                operation();
            }
        }
}
