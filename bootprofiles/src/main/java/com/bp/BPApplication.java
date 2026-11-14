package com.bp;

import com.bp.beans.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BPApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BPApplication.class, args);
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        System.out.println(dataSource);
    }
}
