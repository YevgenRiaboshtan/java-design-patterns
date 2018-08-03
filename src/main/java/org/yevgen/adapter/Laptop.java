package org.yevgen.adapter;

import java.util.Objects;

public class Laptop {

    private Usb device;

    public void connect(Usb device) {
        this.device = device;
    }

    public String readInfo() {
        if (Objects.nonNull(device)) {
            return device.readFromDevice();
        }
        throw new DeviceNotConnected();
    }

    public void writeInfo(String info) {
        if (Objects.nonNull(device)) {
            device.writeToDevice(info);
        } else {
            throw new DeviceNotConnected();
        }
    }
}
