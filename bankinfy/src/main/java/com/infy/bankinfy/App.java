package com.infy.bankinfy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.infy.bankinfy.controller.LoginController;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BankInfyConfigurations.class);
        LoginController loginController = applicationContext.getBean("loginController",LoginController.class);
       LoginDTO.setLginName("Punitha");
       LoginDTO.setLoginPassword("Infy1");
        String loginControllerMessage = loginController.authenticateLogin("LoginDTO");
        System.out.println(loginControllerMessage);
    }
}