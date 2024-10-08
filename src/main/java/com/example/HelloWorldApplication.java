package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

    @GetMapping("/")
    public String getIpAddress() {
        try {
            // Fetch the local IP address of the machine
            InetAddress ip = InetAddress.getLocalHost();
            return "IP Address of the machine: " + ip.getHostAddress();
        } catch (UnknownHostException e) {
            return "Unable to get IP address: " + e.getMessage();
        }
    }
}
