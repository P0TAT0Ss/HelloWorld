package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.Controller;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"per.han.controller"},
        useDefaultFilters = false,
        includeFilters =
                {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})})
public class SpringMVCConfig implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }
}
