package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticSliceTest {

    @Test
    public void numberOfArithmeticSlices() {
        ArithmeticSlice obj = new ArithmeticSlice();
        int[] a3 = {1, 2, 3};
        assertEquals(1, obj.numberOfArithmeticSlices(a3));
        int[] a = {1, 2, 3, 4};
        assertEquals(3, obj.numberOfArithmeticSlices(a));
        //1, 1, 2, 5, 7
        int[] a2 = {1, 1, 2, 5, 7};
        assertEquals(0, obj.numberOfArithmeticSlices(a2));
        //[1,2,3,4,5,6]
        //[]

        int[] a4 = new int[0];
        assertEquals(0, obj.numberOfArithmeticSlices(a4));
        int[] a5 = {1, 2, 3, 4, 5, 6};
        assertEquals(10, obj.numberOfArithmeticSlices(a5));
        //[1,2,3,8,9,10]
        int[] a6 = {1, 2, 3, 8, 9, 10};
        assertEquals(2, obj.numberOfArithmeticSlices(a6));


    }
}