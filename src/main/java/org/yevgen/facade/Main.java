package org.yevgen.facade;

public class Main {

    public static void main(String[] arg) {

        final Printer printer = new Printer();

        printer.checkPaper();
        printer.movePaper();
        printer.printInformation();
        printer.moveCartridgeToHome();

        final PrinterFacade printerFacade = new PrinterFacade(printer);
        printerFacade.print();

    }
}
