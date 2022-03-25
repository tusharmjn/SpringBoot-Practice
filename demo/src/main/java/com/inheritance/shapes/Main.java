package com.inheritance.shapes;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    public static Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Shapes> list = new ArrayList<Shapes>();

        System.out.println("Enter the number of shapes you want to enter: ");
        try {
            int num = sc.nextInt();
            if (num < 0) {
                System.out.println("Enter number greater than 0");
            }
            for (int i = 0; i < num; i++) {

                System.out.print("choose the number for shape: 1 Circle 2 Rectangle  3 Square");
                int n = sc.nextInt();
                if (n == 1) {
                    System.out.println("Enter circle name and radius : ");
                    String circleName = sc.next();
                    int a = sc.nextInt();
                    Circle c = new Circle(circleName, a);
                    log.info("Circle Object is Created");
                    list.add(c);
                }

                else if (n == 2) {

                    System.out.println("Enter rectangle name length and width : ");
                    sc.nextLine();
                    String rectName = sc.nextLine();
                    int length = sc.nextInt();
                    int width = sc.nextInt();
                    Rectangle r = new Rectangle(rectName, length, width);
                    log.info("Rectangle Object is Created");
                    list.add(r);
                }

                else if (n == 3) {
                    System.out.println("Enter square name and side : ");
                    sc.nextLine();
                    String sqName = sc.nextLine();
                    int side = sc.nextInt();
                    Square s = new Square(sqName, side);
                    log.info("Square Object is Created");
                    list.add(s);
                }

            }
//        System.out.println(list);

            System.out.println("enter the shape name for which you want to calclulate the area: ");
            sc.nextLine();
            String nameInput = sc.nextLine();
            for (int i = 0; i < list.size(); i++) {
                Shapes tempName = list.get(i);
                if (nameInput.equals(tempName.getName()))
                    System.out.println("area of " + tempName.getName() + ": " + list.get(i).area());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}