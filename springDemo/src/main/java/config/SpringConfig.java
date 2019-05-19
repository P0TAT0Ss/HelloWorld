package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.mvc.Controller;


@Configuration
@ComponentScan(basePackages = {"per.han"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})})
@Import(value = SpringMybatisConfig.class)
public class SpringConfig {
}
