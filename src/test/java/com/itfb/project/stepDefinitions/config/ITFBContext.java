package com.itfb.project.stepDefinitions.config;

import com.itfb.project.pageObjects.GooglePage;
import com.itfb.project.pageObjects.GoogleSearchPage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public interface ITFBContext {

    ApplicationContext context =
            new FileSystemXmlApplicationContext("classpath:message-bean.xml");

    GooglePage googlePage = (GooglePage) context.getBean("googlePage");

    GoogleSearchPage googleSearchPage = (GoogleSearchPage) context.getBean("googleSearchPage");
}
