package com.esDemo.repo;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.esDemo.model.ESTestModel;

public interface ESTestRepo extends ElasticsearchRepository<ESTestModel, Integer> {

	public List<ESTestModel> findById(long id);
	public void deleteById(long id);
}
