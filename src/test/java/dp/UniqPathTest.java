package dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqPathTest {
    @Test
    public void testUniquePaths() {
        UniqPath uniqPath = new UniqPath();
        assertEquals(3, uniqPath.uniquePaths(3, 2));
    }
}