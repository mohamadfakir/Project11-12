package commercialdata;

        import java.util.ArrayList;
import java.util.List;

        public class Stock {

            //Declaring some variables
            private String stockName, stockSymbol;
            private int numOfShares, sharePrice, totalValue;

            //Creating one parameterised constructor where I can define everything.
            public Stock(String stockName, String stockSymbol, int numOfShares, int sharePrice)
            {
                setStockName(stockName);
                setStockSymbol(stockSymbol);
                setNumOfShares(numOfShares);
                setSharePrice(sharePrice);
                setTotalValue(sharePrice*numOfShares);
            }

            //Creating some getter and setter methods.
            public String getStockName() {
                return stockName;
            }

            public void setStockName(String stockName) {
                this.stockName = stockName;
            }

            public int getNumOfShares() {
                return numOfShares;
            }

            public void setNumOfShares(int numOfShares) {
                this.numOfShares = numOfShares;
            }

            public int getSharePrice() {
                return sharePrice;
            }

            public void setSharePrice(int sharePrice) {
                this.sharePrice = sharePrice;
            }

            public int getTotalValue() {
                return totalValue;
            }

            public void setTotalValue(int totalValue) {
                this.totalValue = sharePrice*numOfShares;
            }

            public String getStockSymbol() {
                return stockSymbol;
            }

            public void setStockSymbol(String stockSymbol) {
                this.stockSymbol = stockSymbol;
            }

            //Creating a toString method.
            @Override
            public String toString() {
                return "Stock{" +
                        "stockName='" + stockName + '\'' +
                        ", numOfShares=" + numOfShares +
                        ", sharePrice=" + sharePrice +
                        ", totalValue=" + totalValue +
                        '}';
            }
}
