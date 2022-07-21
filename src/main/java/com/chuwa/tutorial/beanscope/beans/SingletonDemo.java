package com.chuwa.tutorial.beanscope.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author b1go
 * @date 7/20/22 4:40 PM
 * default scope is Singleton
 * or use @Scope to specify it
 */
@Component()
//@Scope("singleton")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonDemo {

}
