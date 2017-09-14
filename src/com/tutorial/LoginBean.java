/**
 * LoginBean.java
 * 
 */

package com.tutorial;

import java.io.Serializable;

import javax.annotation.PostConstruct;

public class LoginBean 
{
    /**
	 * 
	 */
	
	private String name;
    private String password;

    
    
    

    public LoginBean() {
		super();
		
		
    
    }

    @PostConstruct
    public void init(){
    ConnectDB.connect();
    }
    
    
	public String getName ()
    {
        return name;
    }


    public void setName (final String name)
    {
        this.name = name;
    }


    public String getPassword ()
    {
        return password;
    }


    public void setPassword (final String password)
    {
        this.password = password;
        
        
        
    }
    
    
    
   
    
    
}











