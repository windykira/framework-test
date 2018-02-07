package com.baitengsoft.utils;

/**
 * Created by windy on 2018/2/7.
 */
public class StringUtil {

    public static boolean isNotEmpty(String str) {
        if (str == null) {
            return false;
        }
        if (str.trim().length() == 0) {
            return false;
        }

        return true;
    }
}
