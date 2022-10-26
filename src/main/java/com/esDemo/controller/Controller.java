package com.esDemo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esDemo.model.ESTestModel;
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
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<String> save(HttpServletRequest httpServletRequest, ESTestModel esTestModel) {
		try {
			esTestService.save(esTestModel);
			return new ResponseEntity<String>("success", HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("fail", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<String> delete(HttpServletRequest httpServletRequest, ESTestModel esTestModel) {
		try {
			esTestService.deleteById(esTestModel.getId());
			return new ResponseEntity<String>("success", HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("fail", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
