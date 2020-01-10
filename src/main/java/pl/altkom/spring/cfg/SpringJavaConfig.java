package pl.altkom.spring.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "pl.altkom.spring.beans", "pl.altkom.spring.client", "pl.altkom.spring.service" })
public class SpringJavaConfig {
}
