package demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@EnableConfigServer
@RestController
public class Starter {

    @GetMapping("/health")
    public String health() {
        return "success";
    }

        public static void main(String[] args) {
            SpringApplication.run(Starter.class, args);
        }
}
