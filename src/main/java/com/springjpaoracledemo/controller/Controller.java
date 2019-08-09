package com.springjpaoracledemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springjpaoracledemo.entity.User;
import com.springjpaoracledemo.service.UService;

@RestController
@RequestMapping("/user")
public class Controller {
    @Autowired
    UService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }
    
    
 
    @RequestMapping(value = "/adduser", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, 
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public User addNewUser(@RequestBody User user) {
    	System.out.println("User: "+user.getName()+" has been succesfully saved");
        return this.userService.addUser(user);
    }
    
    
    @RequestMapping(value = "/all", method = RequestMethod.DELETE)
    public void deleteAllUsers() {
    	this.userService.deleteAllUsers();
    }
    
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Optional<User> getUser(@PathVariable int id) {
    	return this.userService.getUserById(id);
    }
    
    
    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable int id) {
    	this.userService.deleteUserById(id); 
    }
    
    @RequestMapping(value="/updateuser", method = RequestMethod.PUT,
    		consumes = MediaType.APPLICATION_JSON_VALUE, 
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public User UpdateUser(@RequestBody User user) {
    	
    	return this.userService.updateUser(user); 
    }
    
    
    /**/
    @Autowired
    MessageSource messageSource;

    @RequestMapping(value = "/get-greeting", method = RequestMethod.GET)
    public String greeting() {
        /**
         *   @LocaleContextHolder.getLocale()
         *  Return the Locale associated with the given user context,if any, or the system default Locale otherwise.
         *  This is effectively a replacement for Locale.getDefault(), able to optionally respect a user-level Locale setting.
         */

        return messageSource.getMessage("good.morning", null, LocaleContextHolder.getLocale());
    }
    
    
    @RequestMapping("/hello")
	public String index() {
		return "Greetings from Spring Boot!!!";
	}
     

}