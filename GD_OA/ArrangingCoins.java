package oa;

public class ArrangingCoins {
    private static void arrangeCoins(long[] coins) {
        if (coins == null || coins.length == 0) {
            return ;
        }
        for (int i = 0; i < coins.length; i++) {
            int level = (int)(-1 + Math.sqrt(1+8*coins[i]))/2;
            System.out.println(level);
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        arrangeCoins(new long[] {1,2,3,4,5,6});
    }

}
