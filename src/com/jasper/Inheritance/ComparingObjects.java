package com.jasper.Inheritance;

import java.awt.*;

public class ComparingObjects {
    public static void main(String[] args) {
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);
        System.out.println(point1.equals(point2));
    }
}
