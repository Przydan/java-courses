package pl.przydan.AOP_app._7_after_finally.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("pl.przydan.AOP_app._7_after_finally")
public class AppConfig {
}
