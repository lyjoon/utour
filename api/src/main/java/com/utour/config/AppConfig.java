package com.utour.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Slf4j
@Configuration
public class AppConfig {

    @Bean
    public ReloadableResourceBundleMessageSource messageSource(){
        ReloadableResourceBundleMessageSource source = new ReloadableResourceBundleMessageSource();

        source.setBasename("classpath:/messages/message");
        source.setDefaultEncoding("UTF-8");
        source.setCacheSeconds(60);
        source.setUseCodeAsDefaultMessage(true);
        return source;
    }

    @Bean
    public MessageSourceAccessor messageSourceAccessor(MessageSource messageSource){
        return new MessageSourceAccessor(messageSource);
    }
}
