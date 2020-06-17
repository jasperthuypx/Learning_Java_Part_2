package com.jasper.Inheritance;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {
        // TODO Review
        super(true);
        System.out.println("TextBox");
    }

    @Override
    public String toString() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public void clearText() {
        this.text = "";
    }

    @Override
    public void render() {
        System.out.println("HIHI TextBox");
    }
}
