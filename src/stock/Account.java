package stock;

    import java.util.Scanner;

    public class Account {
        static double amount = 1000;

        Scanner sc = new Scanner(System.in);
        /*
         * creating object of StockManager class
         */
        StockManager sm = new StockManager();

        //getter setter of amount
        public static double getAmount() {
            return amount;
        }
        public static void setAmount(double amount) {
            Account.amount = amount;
        }

        /*
         * method to credit amount into account
         */
        public static void credit(double creditValue) {

            double tempAmount = Account.getAmount();
            tempAmount += creditValue;
            Account.setAmount(tempAmount);

            System.out.println("Current Balance is :" +Account.getAmount());
        }
        /*
         *This Method to withdraw amount from account
         */
        public static boolean debit(double debitValue) {
            if(Account.getAmount() - debitValue < 0) {
                System.out.println("Insufficint funds");
                return false;
            }
            double tempAmount = Account.getAmount();
            tempAmount -= debitValue;
            Account.setAmount(tempAmount);
            return true;
        }
    }

