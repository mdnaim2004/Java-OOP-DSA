public class StockPrice {
    public static int stockprice(int price[]){

        int buy = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i=0; i<price.length; i++){
            if(buy < price[i]){
                int profit = price[i] - buy;

                max_profit = Math.max(max_profit, profit);
            }
            else{
                buy = price[i];
            }
        }
        return max_profit;
    }



    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 6, 4};

        System.out.println(stockprice(price));
    }
}
