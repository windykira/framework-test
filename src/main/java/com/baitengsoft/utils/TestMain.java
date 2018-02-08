package com.baitengsoft.utils;

import com.baitengsoft.framework.annotation.Controller;
import com.baitengsoft.framework.annotation.Service;
import com.baitengsoft.test.AnnotationClassTemplate;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by windy on 2018/2/7.
 */
public class TestMain {

    public static void main(String[] args) throws Exception {

        /*String packageName = "com.baitengsoft.framework";
        Class clazz = Controller.class;
        String str =  new AnnotationClassTemplate(packageName, clazz) {
            @Override
            public boolean checkAddClass(Class<?> cls) {
                return cls.isAnnotationPresent(annotationClass);
            }
        }.getString();
        assert str != null;*/

        /*User user = new User();
        user.setName("Jack");
        user.setAge(12);
        user.setMobile("1356565");
        Class clazz = user.getClass();
        Field[] beanFields = clazz.getDeclaredFields();


        for (Field beanField : beanFields){

            beanField.setAccessible(true);
            Class type= beanField.getType();
            assert type != null;
        }
        Class userClass = Class.forName("com.baitengsoft.utils.User");
        Object object = userClass.newInstance();
        assert object != null;*/

        /*UserEntity user = new UserEntity("137");
        Method method = UserEntity.class.getDeclaredMethod("setName", new Class[]{String.class});
        method.setAccessible(true);
        method.invoke(user, new String[]{"常州"});

        Field field = UserEntity.class.getDeclaredField("mobile");
        field.setAccessible(true);
        System.out.println(field.get(user));

        String name = UserEntity.class.getSimpleName();
        Matcher matcher = Pattern.compile("[A-Z]").matcher(name);
        StringBuilder builder = new StringBuilder(name);
        for (int i = 0; matcher.find(); i++) {
            builder.replace(matcher.start() + i, matcher.end() + i, "_" + matcher.group().toLowerCase());
        }

        assert method != null;*/

        String packageName = "com.baitengsoft.smart";
        Class clazz = Controller.class;
        List<Class<?>> list =  new AnnotationClassTemplate(packageName, clazz) {
            @Override
            public boolean checkAddClass(Class<?> cls) {
                return cls.isAnnotationPresent(annotationClass);
            }
        }.getClassList();
        assert list != null;
    }
}
