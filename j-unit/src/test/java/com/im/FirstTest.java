package com.im;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {

    private First first;
    @BeforeEach
    void before()
    {

        System.out.println("Before all unit test cases ");
        this.first = new First();
    }
    @Test
    void canary(){
        assertTrue(true);
        System.out.println("executed");
    }
    @Nested
    class MainString_Contains_SubString
    {
        @Test
        void should_ReturnNewString_When_MainString_Contains_SubString() {
            //given
            String mainString = "you can ping me anytime";
            String subString = "ping";
            String replacementString = "call";
            String expected = "you can call me anytime";
            //when
            String actual = first.replaceSubString(mainString, subString, replacementString);
            //then
            assertEquals(expected, actual);
        }

        @Test
        void should_ReturnMainString_When_MainString_NotContains_SubString() {
            //given
            String mainString = "dont call me";
            String subString = "available";
            String replacementString = "call";

            //when
            String actual = first.replaceSubString(mainString, subString, replacementString);
            //then
            assertEquals(mainString, actual);
        }

        @Test
        void should_ReturnMainString_When_SubString_IsNull() {
            //given
            String mainString = "hey ! i am now free you can ping me anytime";
            String subString = null;
            String replacementString = "call";
            //when
            String actual = first.replaceSubString(mainString, subString, replacementString);
            //then
            assertNotNull(actual);
            System.out.println("It will return the main string");
        }
        @Test
        void should_ReturnMainString_When_ReplacementString_IsNull() {
            //given
            String mainString = "hey ! i am now free you can ping me anytime";
            String subString = "ping";
            String replacementString = null;
            //when
            String actual = first.replaceSubString(mainString, subString, replacementString);
            //then
            assertNotNull(actual);
            System.out.println("It will return the main string");
        }
    }

    @Nested
    class StringIsPalindrome {
        @Test
        void should_ReturnTrue_When_StringIsPalindrome() {
            //given
            String origString = "dad";
            //when
            boolean isPalindrome = first.isPallindrome(origString);
            //then
            assertTrue(isPalindrome);
        }

        @Test
        void should_ReturnFalse_When_StringIsNotPalindrome() {
            //given
            String origString = "milky";
            //when
            boolean isPalindrome = first.isPallindrome(origString);
            //then
            assertFalse(isPalindrome);
        }

    }
    @Nested
    class  FilterEvenElements {
        @Test
        void should_ReturnList_When_FilterEvenElements() {
            //given
            List<Integer> list = new ArrayList<>();
            list.add(45);
            list.add(56);
            list.add(60);
            list.add(23);
            List<Integer> expected = new ArrayList<>();
            expected.add(45);
            expected.add(23);
            //when
            List<Integer> actual = first.filterEvenElements(list);
            //then
            assertEquals(expected, actual);
        }
        @Test
        void should_ReturnNull_When_ListOnlyContainsEvenElements() {
            //given
            List<Integer> list = new ArrayList<>();
            list.add(46);
            list.add(56);
            list.add(60);
            list.add(24);
            List<Integer> expected = new ArrayList<>();
            expected.add(45);
            expected.add(23);
            ;
            //when
            List<Integer> actual = first.filterEvenElements(list);
            //then
            assertNotEquals(expected, actual);
        }
    }
    @Nested
    class  CalculateAverage {
        @Test
        void should_ReturnAverage_When_We_CalculateAverage() {
            //given
            List<BigDecimal> values = new ArrayList<BigDecimal>();
            values.add(new BigDecimal(123.445));
            values.add(new BigDecimal(234.678));
            values.add(new BigDecimal(345.321));
            BigDecimal expectedValues = new BigDecimal(234.48133333333333894188399426639080047607421875 );

            //when
            BigDecimal actual = first.calculateAverage(values);
            //then
            assertEquals(expectedValues, actual);
        }}
}