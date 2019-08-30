package org.mlw.tools.springframework.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"file:ApplicationContext.xml"})
public class IntegrationRunner {
    public static void main(String[] args) { SpringApplication.run(IntegrationRunner.class, args); }
}