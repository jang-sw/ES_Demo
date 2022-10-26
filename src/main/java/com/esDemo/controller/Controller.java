package com.esDemo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esDemo.service.ESTestService;

@RestController
public class Controller {

	@Autowired ESTestService esTestService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List list(HttpServletRequest httpServletRequest) {
		return esTestService.findById(Long.parseLong(httpServletRequest.getParameter("id")));
		
	}
	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public long count(HttpServletRequest httpServletRequest) {
		return esTestService.countAll();
	}
}
