package org.algaworks.logger.printer;

import org.algaworks.logger.LogPrinter;

public class TxtLogPrinter implements LogPrinter {

    @Override
    public void print(String s) {
        System.out.println("Gravando log em arquivo .txt");
        System.out.println(s);
    }

}
