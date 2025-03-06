package org.algaworks;


import org.algaworks.logger.LogCreator;
import org.algaworks.logger.printer.ConsoleLogPrinter;
import org.algaworks.logger.LogPrinter;
import org.algaworks.logger.Logger;
import org.algaworks.logger.printer.TxtLogPrinter;

public class Main {
    public static void main(String[] args) {
        LogPrinter printer = new ConsoleLogPrinter();
        Logger consoleLog = new LogCreator(printer);
        consoleLog.log("AlgaWorks");

        LogPrinter txtPrinter = new TxtLogPrinter();
        Logger txtLog = new LogCreator(txtPrinter);
        txtLog.log("AlgaWorks");
    }
}