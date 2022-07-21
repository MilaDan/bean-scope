package com.chuwa.tutorial.beanscope.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author b1go
 * @date 7/20/22 5:08 PM
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class School {

    @Autowired
    private StudentPrototype studentPrototype;

    public School() {
        System.out.println("School bean initialized");
    }

    public StudentPrototype getStudentPrototype() {
        return studentPrototype;
    }

    public void setStudentPrototype(StudentPrototype studentPrototype) {
        this.studentPrototype = studentPrototype;
    }
}
