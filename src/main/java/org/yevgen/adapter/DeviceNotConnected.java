package org.yevgen.adapter;

public class DeviceNotConnected extends RuntimeException {
    public DeviceNotConnected() {
        super("Device not connected");
    }
}
