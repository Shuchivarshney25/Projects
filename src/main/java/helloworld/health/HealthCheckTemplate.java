package helloworld.health;

import com.codahale.metrics.health.HealthCheck;

public class HealthCheckTemplate extends HealthCheck {
    private final String template;

    public HealthCheckTemplate(String template) {
        this.template = template;
    }

    @Override
    protected Result check() throws Exception {
        final  String saying = String.format(template, "test");
        if(!saying.contains("test")){
            return Result.healthy("template doesn't include a name");
        }
        return Result.healthy();
    }
    
}
