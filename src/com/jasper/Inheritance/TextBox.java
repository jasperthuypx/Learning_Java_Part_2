package com.jasper.Inheritance;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {
        // TODO Review
        super(false);
        System.out.println("TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clearText() {
        this.text = "";

    }
}
