package com.baitengsoft.utils;

import com.baitengsoft.framework.helper.ClassHelper;

/**
 * Created by windy on 2018/2/7.
 */
public class TestMain {

    public static void main(String[] args){

        try {
            ClassHelper.getClassSet("com.baitengsoft.smart");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
