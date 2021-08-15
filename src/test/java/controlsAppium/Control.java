package controlsAppium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sessions.Session;

import java.net.MalformedURLException;

public class Control {
    protected WebElement control;
    protected By locator;

    public Control(By locator) {
        this.locator = locator;
    }

    protected void find() throws MalformedURLException {
        this.control = Session.getInstance().getDriver().findElement(locator);
    }

    public void click() throws MalformedURLException {
        this.find();
        this.control.click();
    }

    public String getText() throws MalformedURLException {
        this.find();
        return this.control.getText();
    }

    public WebElement getControl() throws MalformedURLException {
        this.find();
        return control;
    }

    public int count() throws MalformedURLException {
        return Session.getInstance().getDriver().findElements(locator).size();
    }
}
