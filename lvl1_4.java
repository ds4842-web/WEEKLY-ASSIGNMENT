public class lvl1_4 {
        
    public static void main(String[] args){
        int costPrice = 129, sellingPrice = 191, profit;
        double profitPercentage;
        profit = sellingPrice - costPrice;
        profitPercentage = (profit / (double) costPrice) * 100;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR "+ sellingPrice);
        System.out.printf("The Profit is INR %d and the Profit Percentage is %.2f",profit, profitPercentage);
    }
    
}
