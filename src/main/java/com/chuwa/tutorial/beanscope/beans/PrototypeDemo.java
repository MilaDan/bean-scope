package com.chuwa.tutorial.beanscope.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author b1go
 * @date 7/20/22 4:52 PM
 */
@Component
@Scope("prototype")
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeDemo {
}
