package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class StockTest {

    @Test
    public void maxProfit() {
        Stock stock = new Stock();
        int[] case1 = {1, 3, 2, 8, 4, 9};
        assertEquals(8, stock.maxProfit(case1, 2));
    }
}