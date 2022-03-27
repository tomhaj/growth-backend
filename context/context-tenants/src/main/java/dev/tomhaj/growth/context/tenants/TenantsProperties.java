package dev.tomhaj.growth.context.tenants;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "tenants")
class TenantsProperties {

}
