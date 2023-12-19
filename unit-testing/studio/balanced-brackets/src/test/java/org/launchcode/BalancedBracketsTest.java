package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void charactersInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[abc]"));
    }
    @Test
    public void oneOpenBracketReturnsFalse() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("[f"));
    }
    @Test
    public void oneClosedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("f]"));
    }
    @Test
    public void moreOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]"));
    }
    @Test
    public void moreClosedBracketsReturnsFalse() {
        assertFalse((BalancedBrackets.hasBalancedBrackets("[[[]]")));
    }
    @Test
    public void oneOpenBracketWithMultipleCharactersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[abc"));
    }
    @Test
    public void onlyBracketsBackwardsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void oppositeBracketsWithMultipleCharactersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]abcd["));
    }
    @Test
    public void multipleOppositeBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]][[["));
    }
    @Test
    public void oppositeBracketsAfterCorrectBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][]]["));
    }
    @Test
    public void oppositeBracketsInsideStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }
}