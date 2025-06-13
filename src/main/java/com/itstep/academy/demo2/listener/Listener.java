package com.itstep.academy.demo2.listener;

import com.itstep.academy.demo2.entity.User;
import com.itstep.academy.demo2.storage.AppStorage;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class Listener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        for (int i = 0; i < 10; i++) {
            AppStorage.set("key" + i, new User("name" + i, "email" + i));
        }
    }
}
