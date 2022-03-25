package com.inheritance.shapes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Rectangle extends Shapes {

    public static Logger log = LogManager.getLogger(Rectangle.class);

    public Rectangle(String name, int a, int b) {

        super(name, a, b);
        log.info("Rectangle Constructor is Created");
    }

    public int area() {
        return a * b;
    }

}