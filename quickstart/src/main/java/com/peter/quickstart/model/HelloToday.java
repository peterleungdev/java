package com.peter.quickstart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@NoArgsConstructor
@Component
@Log
public class HelloToday {

    public String sayTodayDate() {
        String s = String.format(
                "Today is %s",
                LocalDate.now().toString()
        );
        log.info(s);
        return s;
    }
}
