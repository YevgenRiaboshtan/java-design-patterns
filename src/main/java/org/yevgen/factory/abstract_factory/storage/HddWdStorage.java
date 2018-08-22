package org.yevgen.factory.abstract_factory.storage;

import org.yevgen.factory.abstract_factory.Storage;

public class HddWdStorage implements Storage {
    @Override
    public void saveInfo(String info) {
        System.out.println("Write info: " + info + " to WD HDD");
    }
}
