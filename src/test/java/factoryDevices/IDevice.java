package factoryDevices;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public interface IDevice {

    public AppiumDriver create() throws MalformedURLException;
}
