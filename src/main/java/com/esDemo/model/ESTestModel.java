package com.esDemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "aimed_otava")
public class ESTestModel {
	@Id
	long id;
	double alogp;
	long aromatic_rings;
	String db;
	long hba;
	long hbd;
	long heavy_atoms;
	long mass;
	double mwt;
	double psa;
	double ped;
	long ratatable_bonds;
	long ro5_violations;
	String smiles;
}

