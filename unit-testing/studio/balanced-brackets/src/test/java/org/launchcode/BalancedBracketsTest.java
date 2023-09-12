package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test //1
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test //2
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test //3
    public void oneWordWithBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test //4
    public void oneWordWithoutBalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test //5
    public void twoWordsWithBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode], [STL]"));
    }

    @Test //6
    public void twoWordsWithOutBalancedBracketsReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode], [STL"));
    }

    @Test //7
    public void wordThatStartsWithWrongBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test //8
    public void returnsFalseWithCurlyBraces() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch}"));
    }

    @Test //9
    public void returnsTrueForBalancedMultipleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }

    @Test //10
    public void returnsFalseForUnbalancedMultipleBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test //11
    public void returnsFalseWithOnlyCurlyBraces() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[{LaunchCode}}"));
    }

    @Test //12
    public void returnsTrueWithMultipleBracketsAndWords() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]a[]b[]c[]d[]e"));
    }

}