public class v_49_L121_buy_and_sell {
    
    public int maxProfit(int[] prices) {
        // TODO
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for(int i=0;i<prices.length;i++){
            int price = prices[i];
            if(price<minPrice){
                minPrice = price;
            }
            else if(price - minPrice >maxPrice){
                maxPrice = price - minPrice;
            }
        }
        return maxPrice;
    }
}

