package com.baitengsoft.utils;

import com.baitengsoft.framework.annotation.Controller;
import com.baitengsoft.framework.annotation.Request;
import com.baitengsoft.framework.annotation.Service;
import com.baitengsoft.test.AnnotationClassTemplate;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
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

        for (Class<?> actionClass : list){

            Method[] actionMethods = actionClass.getDeclaredMethods();
            for (Method actionMethod : actionMethods){

                if (actionMethod.isAnnotationPresent(Request.Get.class)){
                    String requestPath = actionMethod.getAnnotation(Request.Get.class).value();
                    assert requestPath != null;
                }
            }
        }
        assert list != null;
    }

    @Test
    public void testSQL()
    {
        //dataBaseConfigItemRepository.getDataBaseConfigItem("ZHLX","2");
       /* LinkedTreeMap<Long,String> testMap = new LinkedTreeMap();
        TreeMap map = new TreeMap();
        map.descendingMap();
        testMap.put(4L,"sdadad");
        testMap.put(2L,"sdffffadad");*/

        Map<String,String> hashMap = new HashMap();
        hashMap.put("1","sdadad");
        hashMap.put("2","sdffffadad");

        for(Map.Entry<String,String> maps : hashMap.entrySet()){

            hashMap.remove(maps.getKey());
        }
        String str = "";
    }
}
