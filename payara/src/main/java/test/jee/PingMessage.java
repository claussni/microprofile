package test.jee;

import javax.json.bind.annotation.JsonbProperty;
import java.util.concurrent.atomic.AtomicInteger;

public class PingMessage {

    private final static AtomicInteger atomicInteger = new AtomicInteger();

    @JsonbProperty
    private final String message;
    @JsonbProperty
    private final Integer number;

    public PingMessage(String message, Integer number) {
        this.message = message;
        this.number = number;
    }

    public static PingMessage withMessage(String message) {
        synchronized (atomicInteger) {
            return new PingMessage(message, atomicInteger.addAndGet(1));
        }
    }

    public String getMessage() {
        return message;
    }

    public Integer getNumber() {
        return number;
    }
}
