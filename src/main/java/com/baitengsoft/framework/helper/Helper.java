package com.baitengsoft.framework.helper;

/**
 * Created by windy on 2018/2/7.
 */
public class Helper {

    public static void init() {

        Class<?>[] classList = {ClassHelper.class};

        for (Class<?> cls : classList) {
            ClassHelper.loadClass(cls.getName(), false);
        }
    }

}
