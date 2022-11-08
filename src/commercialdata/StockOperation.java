package commercialdata;

    import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

    public class StockOperation {

        //Catching all stocks to list
        static List<Stock> stockList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        //Returning account balance
        public double valueOf() {
            System.out.println("The current Account Balance is : " +Account.getCurrentBalance());
            return Account.getCurrentBalance();
        }

        //Finding the stock
        public Stock findStock(String symbol) {
            for(Stock temp : stockList)
            {
                if(temp.getStockSymbol().equalsIgnoreCase(symbol)) {
                    return temp;
                }
            }
            return null;
        }

        //Creating Stock
        public Stock createStock(String symbol) {

            System.out.println("Enter the stock name");
            String stockName = scan.next();
            System.out.println("Enter no of shares");
            int numOfShares = scan.nextInt();
            System.out.println("Enter price of each share");
            int sharePrice = scan.nextInt();
            Stock obj = new Stock(stockName, symbol, numOfShares , sharePrice);
            stockList.add(obj);
            return obj;
        }

        //Adding some predefined stock
        public void addStock()
        {
            Stock a = new Stock("TATA", "T", 50 , 1000);
            Stock b = new Stock("Jindal", "J", 35 , 600);
            Stock c = new Stock("Maruti", "M", 40 , 450);
            stockList.add(a);
            stockList.add(b);
            stockList.add(c);
        }

        //Adding some sell stocks which are not there in list
        public Stock sellStock(String symbol) {
            System.out.println("Enter the stock name");
            String stockName = scan.next();
            int numOfShares = 0;
            System.out.println("Enter price of each share");
            int sharePrice = scan.nextInt();
            Stock obj = new Stock(stockName, symbol, numOfShares , sharePrice);
            stockList.add(obj);
            return obj;
        }

        //Buying stock
        public void buy(int amount,String symbol) {
            if(amount > Account.getCurrentBalance())
            {
                System.out.println("Insufficient fund");
                return;
            }

            Stock stock = findStock(symbol);

            if(stock == null)
            {
                stock = createStock(symbol);
            }

            int quantity = (amount / stock.getSharePrice());
            if (quantity < stock.getNumOfShares())
            {
                System.out.println("Buying shares on : "+dateGenerator());
                stock.setNumOfShares(stock.getNumOfShares() - quantity);
                stock.setTotalValue(stock.getSharePrice() * stock.getNumOfShares());
                double debitValue = quantity * stock.getSharePrice();
                Account.debit(debitValue);
            }
            else
            {
                System.out.println("Insufficient share present");
            }

        }

        //Selling stock
        public void sell(int amount, String symbol) {
            Stock stock = findStock(symbol);

            if(stock == null)
            {
                stock = sellStock(symbol);
            }

            int quantity = (amount / stock.getSharePrice());
            System.out.println("Selling shares on : "+dateGenerator());
            stock.setNumOfShares(stock.getNumOfShares() + quantity);
            stock.setTotalValue(stock.getSharePrice() * stock.getNumOfShares());
            double creditValue = stock.getSharePrice() * quantity;
            Account.credit(creditValue);
        }

        //Method to grab date and time
        public String dateGenerator() {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            return formatter.format(date);
        }

        //Printing all stock details of a particular stock
        public void printStockReport(String symbol) {
            Stock stock = findStock(symbol);
            if(!stockList.isEmpty())
            {
                int value = 0;
                for (Stock temp : stockList)
                {
                    if (temp.equals(stock))
                    {
                        System.out.println(temp);
                        value += temp.getTotalValue();
                    }
                }
                System.out.println(stock.getStockName()+" stock portfolio is of worth $ : " + value);
            }
            else
                System.out.println("Stock list is empty.");
        }

        //Printing overall stock list
        public void printWholeStock()
        {
            if(!stockList.isEmpty())
            {
                int value = 0;
                for (Stock stock : stockList) {
                    System.out.println(stock);
                    value += stock.getTotalValue();
                }
                System.out.println("Your Total stock portfolio is of worth $ : " + value);
            }
            else
                System.out.println("Stock list is empty.");
        }
}
