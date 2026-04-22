package com.Question3;

public class Compare {
        public static <T> boolean isEqual(T a, T b) {
            if (a == null && b == null) {
                return true;
            }
            if (a == null || b == null) {
                return false;
            }
            return a.equals(b);
        }
}
