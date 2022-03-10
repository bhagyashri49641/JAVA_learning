package com.infy.bankinfy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration//Spring Container will understand the config from this class
@ComponentScan("com.infy.bankinfy")
@PropertySource("classpath:application.properties")
public class BankInfyConfigurations 
{
   /* @Bean//this bean will be registered with the IOC container and capable of going ahead with DI as well
    public LoginController loginController() 
    {
        return new LoginController();
    }
    */
}