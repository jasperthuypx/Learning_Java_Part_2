package com.jasper.Inheritance;

public class CheckBoxMain {
    public static void main(String[] args) {
        UIControl[] controls = {new TextBox(), new CheckBox(true)};
        for (var control : controls) {
            control.render();
        }

    }
}
