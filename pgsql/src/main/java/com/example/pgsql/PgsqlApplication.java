package com.example.pgsql;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
@Log
public class PgsqlApplication implements CommandLineRunner {

    private final DataSource dataSource;

    public PgsqlApplication(final DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(PgsqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Data Source: " + this.dataSource.toString());
        final JdbcTemplate restTemplate = new JdbcTemplate(dataSource);
        restTemplate.execute("select 1");
    }
}