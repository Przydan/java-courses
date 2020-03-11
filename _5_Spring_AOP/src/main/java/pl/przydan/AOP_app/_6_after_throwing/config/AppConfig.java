package pl.przydan.AOP_app._6_after_throwing.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("pl.przydan.AOP_app._6_after_throwing")
public class AppConfig {
}
