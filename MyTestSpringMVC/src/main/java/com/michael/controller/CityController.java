package com.michael.controller;

import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.ejb.access.LocalStatelessSessionProxyFactoryBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.portlet.HandlerMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Controller
public class CityController {

    @RequestMapping(value = "/controll/searchCityByProvince", method = RequestMethod.GET)
    public @ResponseBody
    Map<String, String> searchCityByProvince() {
        Map<String, String> result = new HashMap<>();
        result.put("result", "true");
        return result;
    }

}
