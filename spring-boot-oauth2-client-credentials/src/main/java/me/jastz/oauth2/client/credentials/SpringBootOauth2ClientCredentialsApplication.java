package me.jastz.oauth2.client.credentials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;


@Configuration
@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
public class SpringBootOauth2ClientCredentialsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOauth2ClientCredentialsApplication.class, args);
    }
}
