package com.chuwa.tutorial.beanscope.beans;

import org.springframework.stereotype.Component;

/**
 * @author b1go
 * @date 7/20/22 5:00 PM
 */
@Component
public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
