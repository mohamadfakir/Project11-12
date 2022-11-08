package stock;

    import java.util.ArrayList;
import java.util.List;

    public class StockPortfolio {
        List<StockPortfolio> stock = new ArrayList<StockPortfolio>();
        private String stockName;
        private int quantity;
        private double perSharePrice;
        private double totalSharePrice;
        private static double totalValue;

        /**
         * getters and setters
         */
        public List<StockPortfolio> getStock(){
            return stock;
        }

        public void setStock(List<StockPortfolio> stock) {
            this.stock = stock;
        }


        public String getStockName() {
            return stockName;
        }

        public void setStockName(String stockName) {
            this.stockName = stockName;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPerSharePrice() {
            return perSharePrice;
        }

        public void setPerSharePrice(double perSharePrice) {
            this.perSharePrice = perSharePrice;
        }

        public double getTotalSharePrice() {
            return totalSharePrice;
        }

        public void setTotalSharePrice(double totalSharePrice) {
            this.totalSharePrice = totalSharePrice;
        }

        public static double getTotalValue() {
            return totalValue;
        }

        public static void setTotalValue(double totalValue) {
            StockPortfolio.totalValue = totalValue;
        }

        /*
         *
         * toString method
         */
        @Override
        public String toString() {
            System.out.println(" Share Report for " + stockName.toUpperCase());
            System.out.println(" Share Name: " + stockName.toUpperCase());
            System.out.println(" Total quantity of share purchased: " + quantity);
            System.out.println(" Price per share is : " + perSharePrice);
            System.out.println(" Total value of this share is: " + totalSharePrice);
            return "";
        }
}
