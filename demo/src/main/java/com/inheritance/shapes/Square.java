package com.inheritance.shapes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Square extends Shapes {

    public static Logger log = LogManager.getLogger(Square.class);

    public Square(String name, int a) {

        super(name, a);
        log.info("Square Constructor is Created");

    }

    public int area() {
        return a * a;
    }
}
