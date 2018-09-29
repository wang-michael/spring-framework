package com.michael.beanpostprocessor;

import com.michael.model.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by michael on 2018/9/28.
 */
public class UserBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof User) {
            //输出原始属性
            System.out.println("前置拦截user");
            return bean;
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof User) {
            //修改属性值，并返回
            System.out.println("后置拦截user" + bean + " processor: " + this);
            return bean;
        }
        return bean;
    }
}
