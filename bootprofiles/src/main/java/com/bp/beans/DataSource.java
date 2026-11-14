package com.bp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class DataSource {
    @Value("${db.type}")
    private String dataBaseType;
    @Value("${db.driverClass}")
    private String driverClass;
    @Value("${db.url}")
    private String url;
    @Value("${db.userName}")
    private String userName;
    @Value("${db.password}")
    private String password;

}
