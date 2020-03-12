package pl.przydan.AOP_app._3_order_aspects.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("pl.przydan.AOP_app._3_order_aspects")
public class AppConfig {
}
