package com.bc;

import com.bc.beans.Tournament;
import com.bc.initializer.YamlConfigApplicationContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class BootConfigApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplicationBuilder(BootConfigApplication.class)
                .initializers(new YamlConfigApplicationContextInitializer()).build(args);
        ApplicationContext context = springApplication.run(args);
        Tournament tournament = context.getBean("tournament", Tournament.class);
        System.out.println(tournament);
    }
}
