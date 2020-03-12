package pl.przydan.AOP_app._5_after_returning.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("pl.przydan.AOP_app._5_after_returning")
public class AppConfig {
}
