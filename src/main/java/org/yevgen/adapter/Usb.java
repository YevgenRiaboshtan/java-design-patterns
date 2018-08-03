package org.yevgen.adapter;

public interface Usb {
    String readFromDevice();

    void writeToDevice(String information);
}
