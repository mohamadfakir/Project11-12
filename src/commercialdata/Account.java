package commercialdata;

    public class Account {

        //Declaring account balance
        private static double currentBalance = 120385.57;

        public static double getCurrentBalance() {
            return currentBalance;
        }

        public static void setCurrentBalance(double currentBalance) {
            Account.currentBalance = currentBalance;
        }

        //Creating a credit method
        public static void credit(double creditValue)
        {
            double balance = currentBalance + creditValue;
            setCurrentBalance(balance);
            System.out.println("Amount Added Successfully");
            viewBalance();

        }

        //Creating a debit method
        public static boolean debit(double debitValue)
        {
            if (debitValue <= 0)
            {
                System.out.println("Please Enter Valid Amount");
            }
            else if (debitValue > currentBalance)
            {
                System.out.println("Insufficient Balance\nPlease try again");
                return false;
            }
            else
            {
                System.out.println("Please wait ");
                System.out.println(".......");
                System.out.println("Balance withdraw successfully");
                double balance = currentBalance - debitValue;
                setCurrentBalance(balance);
                viewBalance();
            }
            return true;
        }

        //Creating a view balance method
        public static void viewBalance()
        {
            System.out.println("\nAvailable Balance is : " + currentBalance);
        }
}
