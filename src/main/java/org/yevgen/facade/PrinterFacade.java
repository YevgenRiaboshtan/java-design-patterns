package org.yevgen.facade;

public class PrinterFacade {

    private final Printer printer;

    public PrinterFacade(Printer printer) {
        this.printer = printer;
    }

    public void print() {
        printer.checkPaper();
        printer.movePaper();
        printer.printInformation();
        printer.moveCartridgeToHome();
    }
}
