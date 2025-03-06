package org.algaworks.logger.printer;

import org.algaworks.logger.LogPrinter;

public class ConsoleLogPrinter implements LogPrinter {

    @Override
    public void print(String s) {
        System.out.println("Exibindo log no console");
        System.out.println(s);
    }

}
