package com.baitengsoft.listener;

import com.baitengsoft.framework.helper.Helper;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by windy on 2018/2/7.
 */
public class ContainerListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {

        Helper.init();
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
