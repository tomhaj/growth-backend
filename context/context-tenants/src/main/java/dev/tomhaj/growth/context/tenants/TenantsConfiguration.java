package dev.tomhaj.growth.context.tenants;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(TenantsProperties.class)
@ComponentScan(basePackages = "dev.tomhaj.growth.context.tenants")
public class TenantsConfiguration {

}
