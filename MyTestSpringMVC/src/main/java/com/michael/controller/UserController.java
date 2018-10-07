package com.michael.controller;

import com.michael.model.User;
import com.michael.service.UserService;
import org.apache.ibatis.binding.MapperProxy;
import org.apache.ibatis.executor.SimpleExecutor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.mybatis.spring.transaction.SpringManagedTransactionFactory;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.aop.framework.*;
import org.springframework.aop.framework.adapter.AdvisorAdapterRegistry;
import org.springframework.aop.framework.adapter.DefaultAdvisorAdapterRegistry;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.config.PropertyResourceConfigurer;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.beans.factory.xml.BeanDefinitionParserDelegate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.config.TxNamespaceHandler;
import org.springframework.transaction.interceptor.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FrameworkServlet;
import org.springframework.web.servlet.handler.AbstractHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.xml.ws.Dispatch;
import java.net.DatagramSocket;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by michael on 2018/9/15.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public UserController() {
        System.out.println("UserController init------------" + this.getClass().getName());
    }

    @RequestMapping(value = "/controll/searchUserByUserId", method = RequestMethod.POST)
    public @ResponseBody
    Map<String, Object> searchUserByUserId(Integer userId) {
        // Test SSH key
        Map<String, Object> result = new HashMap<>();
        result.put("result", userService.searchUserByUserId(userId));
        return result;
    }

    @RequestMapping(value = "/controll/insertUser", method = RequestMethod.POST)
    public @ResponseBody
    Map<String, Object> insertUser(String userName, Integer userAge) {
        Map<String, Object> result = new HashMap<>();
        result.put("result", userService.insertUser(userName, userAge));
        return result;
    }
}
