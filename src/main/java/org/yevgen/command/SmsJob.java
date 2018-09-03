package org.yevgen.command;

import java.util.Objects;

public class SmsJob implements Job {

    private Sms sms;

    public void setSms(Sms sms) {
        this.sms = sms;
    }

    @Override
    public void run() {
        System.out.println("Job ID:" + Thread.currentThread().getId() + " executing sms jobs.");
        if (Objects.nonNull(sms)) {
            sms.sendSms();
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
