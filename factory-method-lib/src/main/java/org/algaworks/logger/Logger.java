package org.algaworks.logger;

import java.time.LocalDateTime;

public abstract class Logger {

    protected abstract LogPrinter createLogger();

    public void log(String message) {
        LocalDateTime localDateTime = LocalDateTime.now();
        createLogger()
                .print(localDateTime.toString().concat(" - ").concat(message));
    }

}
