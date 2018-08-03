package org.yevgen.adapter;

import java.util.Objects;

public class SataToUsbAdapter implements Usb {
    private final Sata device;

    public SataToUsbAdapter(Sata device) {
        this.device = device;
    }

    @Override
    public String readFromDevice() {
        if (Objects.nonNull(device)) {
            return device.readInfo();
        }
        throw new DeviceNotConnected();
    }

    @Override
    public void writeToDevice(String information) {
        if (Objects.nonNull(device)) {
            device.writeInfo(information);
        } else {
            throw new DeviceNotConnected();
        }
    }
}
