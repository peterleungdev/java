package com.peter.quickstart.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "myuser")
@Data
public class MyUser {
    private String surname;
    private String forename;
    private String country;

    public String getUserInfo() {
        return String.format(
                "%s %s from %s",
                this.forename,
                this.surname,
                this.country);

    }
}
