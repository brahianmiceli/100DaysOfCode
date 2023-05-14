package org.Practices.DesignPatterns.AbstractFactory.factories;

import org.Practices.DesignPatterns.AbstractFactory.buttons.Button;
import org.Practices.DesignPatterns.AbstractFactory.buttons.WindowsButton;
import org.Practices.DesignPatterns.AbstractFactory.checkboxes.Checkbox;
import org.Practices.DesignPatterns.AbstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}