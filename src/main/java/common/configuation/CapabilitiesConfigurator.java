package common.configuation;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.*;
import static io.appium.java_client.remote.MobileCapabilityType.*;

public class CapabilitiesConfigurator {
    private CapabilitiesConfigurator(){}
    public static DesiredCapabilities getLocalEmulatorCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(UDID,ConfigurationReader.get().udid());
        capabilities.setCapability(AVD, ConfigurationReader.get().localDeviceName());
        capabilities.setCapability(APP_PACKAGE,ConfigurationReader.get().appPackage());
        capabilities.setCapability(APP_ACTIVITY,ConfigurationReader.get().appActivity());
        capabilities.setCapability(APP, new File(ConfigurationReader.get().appPath()).getAbsolutePath());
        return capabilities;
    }
    public static DesiredCapabilities getRealDeviceCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(AUTOMATION_NAME,ConfigurationReader.get().automationName());
        capabilities.setCapability(DEVICE_NAME,ConfigurationReader.get().realDeviceName());
        capabilities.setCapability(APP_PACKAGE,ConfigurationReader.get().appPackage());
        capabilities.setCapability(APP_ACTIVITY,ConfigurationReader.get().appActivity());
        capabilities.setCapability(APP, new File(ConfigurationReader.get().appPath()).getAbsolutePath());
        return capabilities;
    }
}
