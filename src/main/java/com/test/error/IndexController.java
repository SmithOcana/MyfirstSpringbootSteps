package com.test.error;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.HttpStatus;

@RestController
public class IndexController implements ErrorController {
	 
    /*@RequestMapping("/error.html")
    public String handleError() {
        //do something like logging
        return "<h1>!error</h1>";
    }*/
    
   
	/*public ModelAndView handleError() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("error");
		return modelAndView;
	}*/
    
     @RequestMapping("/error.html")
     public String handleError(HttpServletRequest request) {
    	    Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

    	    if (status != null) {
    	        Integer statusCode = Integer.valueOf(status.toString());

    	        if(statusCode == HttpStatus.NOT_FOUND.value()) {
    	            return "error404";
    	        }
    	        else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
    	            return "error500";
    	        }
    	    }
    	    return "error";
 
 }   
    @Override
	public String getErrorPath() {
        return "/error";
    }
}
