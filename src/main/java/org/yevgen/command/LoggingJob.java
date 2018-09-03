package org.yevgen.command;

import java.util.Objects;

public class LoggingJob implements Job {

    private Logging logging;

    public void setLogging(Logging logging) {
        this.logging = logging;
    }

    @Override
    public void run() {
        System.out.println("Job ID:" + Thread.currentThread().getId() +  " executing logging jobs.");
        if (Objects.nonNull(logging)) {
            logging.log();
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
