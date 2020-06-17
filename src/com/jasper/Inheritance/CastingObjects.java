package com.jasper.Inheritance;

public class CastingObjects {
    public static void main(String[] args) {
        var control = new UIControl(true);
        // what if we pass a textbox object?
        var textBox = new TextBox();
//        show(control);
//        show(textBox);
// if we pass control => crash
        show(control);
    }

    public static void show(UIControl control) {
        // cast to textbox to get textbox's method
        // pass control => check is instance of textbox
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello");
        }
           System.out.println(control);
    }
}
