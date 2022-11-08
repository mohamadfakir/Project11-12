package accountopration;

    import java.util.Scanner;

    public class Account {

        //Declaring account balance
        private static double currentBalance = 120385.57;
        Scanner scan = new Scanner(System.in);

        //Creating a credit method
        public void credit()
        {
            System.out.println("\nPlease Enter the Amount you want to add");
            double addAmount = scan.nextDouble();
            currentBalance = currentBalance + addAmount;
            System.out.println("Amount Added Successfully");
            System.out.println("\nPress y to view account Balance");
            String acc = scan.next();
            if (acc.equalsIgnoreCase("y"))
            {
                viewBalance();
            }
            else
            {
                System.out.println("Thank you for banking with us.....");
            }
        }

        //Creating a debit method
        public void debit()
        {
            System.out.println("Enter the amount you want to withdrawn");
            double withDrawAmount = scan.nextDouble();
            if (withDrawAmount <= 0)
            {
                System.out.println("Please Enter Valid Amount");
            }
            else if (withDrawAmount > currentBalance)
            {
                System.out.println("Insufficient Balance\nPlease try again");
                debit();
            }
            else
            {
                System.out.println("Please wait ");
                System.out.println(".......");
                System.out.println("Balance withdraw successfully");
                currentBalance = currentBalance - withDrawAmount;
                viewBalance();
            }
        }

        //Creating a view balance method
        public void viewBalance()
        {
            System.out.println("\nAvailable Balance is : " + currentBalance);
            System.out.println("Thank you for banking with us.....");
        }
}
