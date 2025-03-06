package org.algaworks.logger;

public class LogCreator extends Logger {

    private final LogPrinter logPrinter;

    public LogCreator(LogPrinter logPrinter) {
        this.logPrinter = logPrinter;
    }

    @Override
    protected LogPrinter createLogger() {
        return logPrinter;
    }

}
