package org.Practices.DesignPatterns.AbstractFactory.factories;

import org.Practices.DesignPatterns.AbstractFactory.buttons.Button;
import org.Practices.DesignPatterns.AbstractFactory.buttons.MacOSButton;
import org.Practices.DesignPatterns.AbstractFactory.checkboxes.Checkbox;
import org.Practices.DesignPatterns.AbstractFactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }

}

