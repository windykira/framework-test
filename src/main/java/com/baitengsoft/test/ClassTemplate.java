package com.baitengsoft.test;

import com.baitengsoft.framework.annotation.Service;

/**
 * Created by Administrator on 2018/2/7.
 */
public abstract class ClassTemplate {

    protected final String packageName;

    protected ClassTemplate(String packageName) {
        this.packageName = packageName;
    }

    public final String getString(){
        if(checkAddClass(Service.class)){
            return "ok";
        }
        return "no";
    }

    public abstract boolean checkAddClass(Class<?> cls);
}
