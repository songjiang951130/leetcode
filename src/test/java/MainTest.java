import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testisPalindrome() {
        Main main = new Main();
        assertTrue(main.isPalindrome(121));
        assertFalse(main.isPalindrome(-121));
        assertTrue(main.isPalindrome(10));
    }

    @Test
    public void testRomentoInt() {
        Main main = new Main();
        assertEquals(main.romanToInt("III"), 3);
        assertEquals(main.romanToInt("VI"), 6);
        assertEquals(main.romanToInt("IV"), 4);
        assertEquals(main.romanToInt("IX"), 9);
        assertEquals(main.romanToInt("LVIII"), 58);
        assertEquals(main.romanToInt("MCMXCIV"), 1994);
    }

    // longestCommonPrefix
    @Test
    public void testlongestCommonPrefix() {
        Main main = new Main();
        String[] array1 = { "flower", "flow", "flight" };
        String[] array2 = { "dog", "race", "car" };
        String[] array3 = { "aa", "a" };
        String[] array4 = { "a", "ac" };
        String[] array5 = { "a" };

        assertEquals(main.longestCommonPrefix(array1), "fl");
        assertEquals(main.longestCommonPrefix(array2), "");
        assertEquals(main.longestCommonPrefix(array3), "a");
        assertEquals(main.longestCommonPrefix(array4), "a");
        assertEquals(main.longestCommonPrefix(array5), "a");
    }

    @Test
    public void testreverseWords() {
        Main main = new Main();
        String str = "   a   b ";
        assertEquals(main.reverseWords(str), "b a");

    }

    public void testBuild() {

    }

}
