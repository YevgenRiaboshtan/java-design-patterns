package org.yevgen.adapter;

public class SataHDD implements Sata {

    private String info = "Sata HDD info";

    @Override
    public String readInfo() {
        return info;
    }

    @Override
    public void writeInfo(String info) {
        this.info = info;
        System.out.println("Write " + info + " to Sata HDD");
    }
}
