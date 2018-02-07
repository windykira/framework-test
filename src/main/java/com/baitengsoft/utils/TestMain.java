package com.baitengsoft.utils;

import com.baitengsoft.framework.annotation.Controller;
import com.baitengsoft.framework.helper.ClassHelper;
import com.baitengsoft.test.AnnotationClassTemplate;

/**
 * Created by windy on 2018/2/7.
 */
public class TestMain {

    public static void main(String[] args){

        String packageName = "com.baitengsoft.framework";
        Class clazz = Controller.class;
        String str =  new AnnotationClassTemplate(packageName, clazz) {
            @Override
            public boolean checkAddClass(Class<?> cls) {
                return cls.isAnnotationPresent(annotationClass);
            }
        }.getString();
        assert str != null;
    }
}
