package test;
import main.BalancedBrackets;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    BalancedBrackets bracket_test = new BalancedBrackets();

    //TODO: add tests here
    //Test 1
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //Test 2
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    // POSITIVE TESTS: Positive Testing: Assuming everything will run as expected, so that only valid outcome will happen.

    /// assuming that code will read as true if "[]" is inputed
    //Test 3
    @Test
    public void testJustBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }


    //Test 4
    @Test
    public void testNoBracketsAtAll() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    //Test 5
    @Test
    public void testJustWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    //Test 6
    @Test
    public void testWordInNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Testing [Launch [Co [de]]]"));
    }

    //Test 7
    @Test
    public void testNonNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("May [the] force [be] with [you]."));
    }

    // NEGATIVE TESTS: Negative Testing: assuming that everything will run as expected with unexpected input.

    //Test 8
    @Test
    public void testNothingButBracketsLotsAndLotsOfBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][][][]]][][][][[[][][][[[][][][][["));
    }
    //Test 9
    @Test
    public void testNoEndBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Toto], we're [not] in Kansas any more.]"));
    }

    //Test 10
    @Test
    public void testBracketsInsideOutFramingWord() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("I ]Love[ you Mom."));
    }


}
