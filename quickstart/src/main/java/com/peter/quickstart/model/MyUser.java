package com.peter.quickstart.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Component
public class MyUser {
    private String surname;
    private String forename;
    private String country;

    public String getUserInfo() {
        if (this.surname == null) {
            this.surname = "root";
        }
        if (this.forename == null) {
            this.forename = "root";
        }
        if (this.country == null) {
            this.country = "super earth";
        }
        return String.format(
                "%s %s from %s",
                this.forename,
                this.surname,
                this.country);

    }
}
