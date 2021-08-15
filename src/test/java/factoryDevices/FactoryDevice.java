package factoryDevices;

public class FactoryDevice {

    public enum DeviceType{
        ANDROID,
        IOS,
        CLOUDANDROID
    }
    public static IDevice make(DeviceType type) {
        IDevice iDevice;
        switch (type) {
            default:
                iDevice = new Android();
                break;
        }
        return iDevice;
    }
}
