package com.baitengsoft.test;

import java.lang.annotation.Annotation;

/**
 * Created by Administrator on 2018/2/7.
 */
public abstract class AnnotationClassTemplate extends ClassTemplate{

    protected final Class<? extends Annotation> annotationClass;

    protected AnnotationClassTemplate(String packageName, Class<? extends Annotation> annotationClass) {
        super(packageName);
        this.annotationClass = annotationClass;
    }
}
