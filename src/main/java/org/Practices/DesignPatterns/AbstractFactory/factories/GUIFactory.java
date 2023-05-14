package org.Practices.DesignPatterns.AbstractFactory.factories;

import org.Practices.DesignPatterns.AbstractFactory.buttons.Button;
import org.Practices.DesignPatterns.AbstractFactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
