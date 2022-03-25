package com.inheritance.shapes;

class Shapes {

    protected String name;
    protected int a;
    protected int b;
    final double Pi = 3.14;

    Shapes() {

    }

    Shapes(String name, int a) {
        this.name = name;
        this.a = a;
    }

    Shapes(String name, int a, int b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int area() {
        return 0;
    }

//    @Override
//    public String toString() {
//        return "Shapes [name=" + name + ", a=" + a + ", b=" + b + ", Pi=" + Pi + "]";
//    }

}
