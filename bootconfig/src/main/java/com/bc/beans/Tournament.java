package com.bc.beans;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "tournament")
public class Tournament {
    private int tournamentNo;
    private String tournamentName;
    private int prize;
    private int teams;

}
