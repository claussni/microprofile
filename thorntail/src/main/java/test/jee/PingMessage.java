package test.jee;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;

@Stateless
@ApplicationScoped
public class PingMessage {

    public String message() {
        return "Hello Ping!";
    }

}
