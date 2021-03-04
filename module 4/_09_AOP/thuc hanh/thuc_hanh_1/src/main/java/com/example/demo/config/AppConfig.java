package com.example.demo.config;

import com.example.demo.concern.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableAspectJAutoProxy
public class AppConfig extends WebMvcConfigurerAdapter implements ApplicationContextAware {
    @Bean
    public Logger logger() {
        return new Logger();
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
