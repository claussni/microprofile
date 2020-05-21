package test.jee;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

import javax.enterprise.context.ApplicationScoped;

@Readiness
@ApplicationScoped
public class ReadinessResource implements HealthCheck {
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.named("are-we-ready").up().withData("how-much-is-the-fish", "5000").build();
    }
}
