package com.clevertec.gradleplugin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private static final String POSITIVE_INTEGER_NUMBER = "1024";
    private static final String POSITIVE_FLOAT_NUMBER = "8.20";
    private static final String EXTREMELY_LONG_POSITIVE_NUMBER = "9999999999999999999999999999999999999999";
    private static final String NEGATIVE_NUMBER = "-512";
    private static final String EMPTY_STRING = "";
    private static final String NOT_PARSABLE_STRING = "Two";

    @Test
    void testPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber(POSITIVE_INTEGER_NUMBER));
    }

    @Test
    void testPositiveFloatNumber() {
        assertTrue(StringUtils.isPositiveNumber(POSITIVE_FLOAT_NUMBER));
    }

    @Test
    void testExtremelyLongNumber() {
        assertTrue(StringUtils.isPositiveNumber(EXTREMELY_LONG_POSITIVE_NUMBER));
    }

    @Test
    void testNegativeNumber() {
        assertFalse(StringUtils.isPositiveNumber(NEGATIVE_NUMBER));
    }

    @Test
    void testEmptyString() {
        assertFalse(StringUtils.isPositiveNumber(EMPTY_STRING));
    }

    @Test
    void testNotParsableString() {
        assertFalse(StringUtils.isPositiveNumber(NOT_PARSABLE_STRING));
    }

    @Test
    void testNull() {
        assertFalse(StringUtils.isPositiveNumber(null));
    }
}
