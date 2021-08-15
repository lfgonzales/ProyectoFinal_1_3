package sessions;

import controlsAppium.Label;
import factoryDevices.FactoryDevice;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.time.Duration;

public class Session {
    private static Session instance = null;
    private AppiumDriver driver;

    private Session() throws MalformedURLException {
        driver = FactoryDevice.make(FactoryDevice.DeviceType.ANDROID).create();
    }

    public static Session getInstance() throws MalformedURLException {
        if (instance == null)
            instance = new Session();
        return instance;
    }

    public void close() {
        driver.quit();
        instance = null;
    }

    public AppiumDriver getDriver() {
        return driver;
    }
}
