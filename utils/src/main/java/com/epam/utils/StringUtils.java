package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        public static boolean isPositiveNumber(String str) {
            return StringUtils.isNumeric(str) && Integer.parseInt(str) > 0;
        }
    }
}
