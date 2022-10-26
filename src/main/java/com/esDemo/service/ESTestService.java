package com.esDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esDemo.model.ESTestModel;
import com.esDemo.repo.ESTestRepo;

@Service
public class ESTestService {

	@Autowired
	ESTestRepo esTestRepo;
	
	public List<ESTestModel> findById(long id){
		return this.esTestRepo.findById(id);
	}
	
	public long countAll() {
		return this.esTestRepo.count();
	}
}
