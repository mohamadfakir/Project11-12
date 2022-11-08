package accountopration;

    import java.util.Scanner;

    public class AccountTest {

        public static void main(String[] args) {
            Account obj = new Account();
            Scanner scan = new Scanner(System.in);

            System.out.println("\nWelcome...\nWhat do you want?\nPress 1 for Add Amount.\nPress 2 for Withdrawal Amount.\n" +
                    "Press 3 for check Available Balance in your account.");
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    obj.credit();
                    break;
                case 2 :
                    obj.debit();
                    break;
                case 3 :
                    obj.viewBalance();
                    break;
                default :
                    System.out.println("Sorry wrong input!!!\nThank you for banking with us....");
            }
        }
}
