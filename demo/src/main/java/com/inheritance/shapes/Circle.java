package com.inheritance.shapes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Circle extends Shapes {

    public static Logger log = LogManager.getLogger(Circle.class);

    Circle(String name, int a) {

        super(name, a);
        log.info("Circle Constructor is Created");
    }

    public int area() {
        return (int) (Pi * a * a);
    }
}
