
package com.infy.bankinfy.controller;

import org.springframework.stereotype.Component;

@Component
public class LoginController 
{
    public String authenticateLogin(LoginDTO loginDTO)
    {
    	//data validation, if any
        return loginService.authenticateLogin(loginDTO); //calling the services for business logic
    }
}