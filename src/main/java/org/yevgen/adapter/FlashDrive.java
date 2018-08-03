package org.yevgen.adapter;

public class FlashDrive implements Usb {

    private String information = "Usb information";

    public String readFromDevice() {
        return information;
    }

    public void writeToDevice(String information) {
        this.information = information;
        System.out.println("Write " + information + " to Flash drive");
    }
}
