package com.bwwc;

import com.bwwc.servlet.PingServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class BWWWCApplication {
    private final PingServlet pingServlet;

    public BWWWCApplication(PingServlet pingServlet) {
        this.pingServlet = pingServlet;
    }

    @Bean
    public ServletRegistrationBean<PingServlet> pingServletServletRegistrationBean(PingServlet servlet){
       ServletRegistrationBean<PingServlet> pingServletServletRegistrationBean =
               new ServletRegistrationBean<>(pingServlet);
       pingServletServletRegistrationBean.setName("ping");
       pingServletServletRegistrationBean.setUrlMappings(Arrays.asList("/ping"));
       pingServletServletRegistrationBean.setLoadOnStartup(1);
       return pingServletServletRegistrationBean;
    }

    public static void main(String[] args) {
        SpringApplication.run(BWWWCApplication.class);
    }
}
