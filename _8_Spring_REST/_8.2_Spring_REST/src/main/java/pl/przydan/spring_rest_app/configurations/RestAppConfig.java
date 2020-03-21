package pl.przydan.spring_rest_app.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("pl.przydan.spring_rest_app")
public class RestAppConfig {
}
