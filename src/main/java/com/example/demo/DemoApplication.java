package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Slf4j
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private DivisionService divisionService;

    public DemoApplication(DivisionService divisionService) {
        this.divisionService = divisionService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("STARTING THE APPLICATION");
        if (args == null || args.length < 2 || !StringUtils.isNumeric(args[args.length - 1])) {
            throw new IllegalArgumentException();
        }
        List input = new ArrayList<String>();
        for (int i = 0; i < args.length - 1; i++) {
            input.add(args[i]);
        }
        log.info("INPUT : {}, SIZE: {}", input, Integer.valueOf(args[args.length - 1]));
        List diviser = divisionService.diviser(input, Integer.parseInt(args[args.length - 1]));
        log.info("RESULT : {}", diviser);
        log.info("APPLICATION FINISHED");
    }

}
