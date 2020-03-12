package pl.przydan.AOP_app._2_pointcut_declarations.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("pl.przydan.AOP_app._2_pointcut_declarations")
public class AppConfig {
}
