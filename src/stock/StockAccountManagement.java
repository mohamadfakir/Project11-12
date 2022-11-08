package stock;

    import java.util.Scanner;

    public class StockAccountManagement {
        public static void main(String[] args) {
            System.out.println("Welcome to stock account management");
            Scanner sc = new Scanner(System.in);

            StockManager sm = new StockManager();


            while (true) {
                System.out.println(" \n Please enter your choice : "
                        + "\n1.Buy Shares"
                        + "\n2.Sell Shares"
                        + "\n3.Credit amount"
                        + "\n4.Debit amount"
                        + "\n5.Print Account Balance"
                        + "\n6.Print Portfolio Details"
                        + "\n7.Exit");

                int choice = sc.nextInt();
                int amount;
                String symbol;

                switch (choice) {

                    case 1:
                        System.out.println("Enter the stock you want to buy : ");
                        symbol = sc.next();
                        System.out.println("Enter total amount for buy shares");
                        amount = sc.nextInt();
                        sm.buy(amount, symbol);
                        break;

                    case 2:
                        System.out.println("Enter the stock you want to sell : ");
                        symbol = sc.next();
                        System.out.println("Enter value of share to be sell : ");
                        amount = sc.nextInt();
                        sm.sell(amount, symbol);
                        break;

                    case 3:
                        System.out.println("Enter amount to deposite in account : ");
                        amount = sc.nextInt();
                        Account.credit(amount);
                        break;

                    case 4:
                        System.out.println("Enter the amout to withdraw from account :");
                        amount = sc.nextInt();
                        Account.debit(amount);
                        break;

                    case 5:
                        sm.valueOf();
                        break;

                    case 6:
                        sm.printStockReport();
                        break;
                    case 7:
                        System.out.println("Exit from stock management account");
                        sc.close();
                        return;

                    default:
                        System.out.println("Enter valid choice between 1 to 7");
                }

            }

        }
}
