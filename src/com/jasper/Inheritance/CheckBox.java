package com.jasper.Inheritance;

// final class cannot be extended anymore
public final class CheckBox extends UIControl{

    public CheckBox(boolean isEnabled) {
        super(isEnabled);
    }

    @Override
    public void render() {
        System.out.println("Hello Im a Checkbox");
    }
}
