package com.ts.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class LoginServiceTest {

    /**
     * Rigorous Test :-)
     */
	public LoginService service = new LoginService();
	
    @Test
    public void testWithValidCredentials(){
        String result = service.login("raj", "rani");
        assertEquals("Valid Credentials", result);
    }
    
    @Test
    public void testWithInvalidCredentials() {
    	String result = service.login("ds", "ds");
    	assertEquals("invalid Credentials", result);
    }
    
    @Test
    public void testWithInvalidInput() {
    	String result = service.login("", "");
    	assertEquals("invalid input", result);
    }
    
}
