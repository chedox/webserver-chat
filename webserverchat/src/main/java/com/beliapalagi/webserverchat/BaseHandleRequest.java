/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beliapalagi.webserverchat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author rendr
 */
@Controller
public class BaseHandleRequest {
   
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception{
        ModelAndView model = new ModelAndView();      
        model.setViewName("index");
        return model;
    }
  
}
