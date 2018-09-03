package org.yevgen.command;

import java.util.Objects;

public class FileIOJob implements Job {

    private FileIO fileIO;

    public void setFileIO(FileIO fileIO) {
        this.fileIO = fileIO;
    }

    @Override
    public void run() {
        System.out.println("Job ID:" + Thread.currentThread().getId() +  " executing fileIO jobs.");
        if (Objects.nonNull(fileIO)) {
            fileIO.execute();
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
